package fr.simplifia.transform;

import fr.simplifia.input.validator.SmpInputValidator;
import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class SmpDataTransformer {

    private SmpInputValidator validator;
    private static final String MESSAGE = " : bienvenue chez Simplifia!";
    private static final String MESSAGE_EN = " : Welcome to Simplifia!";
    public SmpDataTransformer(final SmpInputValidator validator) {
        this.validator = validator;
    }

    public String transform(final String input, final String locale){
        validator.validateInput(input);
        final StringBuffer buffer = new StringBuffer();
        buffer.append(input);
        final String cleanedLocale = StringUtils.trim(locale).toLowerCase();
        final String cleanedInput = StringUtils.stripAccents(input);
        System.out.println(cleanedInput);

        switch (cleanedLocale) {
            case "fr":
                buffer.append(MESSAGE);
                break;
            case "en":
                buffer.append(MESSAGE_EN);
                break;
        }
        return buffer.toString();
    }

}
