package fr.simplifia.transform;

import fr.simplifia.input.validator.SmpInputValidator;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.util.Collections;

import static org.mockito.Mockito.*;
import static org.testng.Assert.*;


public class SmpDataTransformerTest {

    private SmpInputValidator validator;

    public SmpDataTransformerTest(){
        validator = Mockito.mock(SmpInputValidator.class);
        //TODO : mocking strategy
        //when(validator.validateInput(input)).thenReturn();
        doNothing().doThrow(new IllegalArgumentException()).when(validator).validateInput("");
    }

    @Test
    public void testTransformOk() throws Exception {
        verify(validator, atLeastOnce()).validateInput("");
    }

    @Test
    public void testTransformNotOk() throws Exception {

    }


    @Test
    public void testTransformEmpty() throws Exception {

    }

    @Test
    public void testTransformNull() throws Exception {

    }


}