package com.itclass.GenericHw.task1;


import org.junit.Assert;
import org.junit.Test;

public class StringValidatorTest {

    @Test
    public void testValidateTrue() {
        StringValidator validator = new StringValidator();
        String string = "Valera Petrov.";
        Assert.assertEquals(true, validator.validate(string));
    }

    @Test
    public void testValidateFalse() {
        StringValidator validator = new StringValidator();
        String string = "valera Petrov.";
        Assert.assertEquals(false, validator.validate(string));
    }
}