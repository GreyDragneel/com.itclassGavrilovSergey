package com.itclass.GenericHw.task1;

import org.junit.Assert;
import org.junit.Test;

import static com.itclass.GenericHw.task1.ValidatorFactory.getValidator;

public class ValidatorFactoryTest {

    @Test
    public void testGetValidatorInteger() {
        Integer integer = new Integer(5);
        Assert.assertEquals(IntegerValidator.class, getValidator(integer).getClass());
    }

    @Test
    public void testGetValidatorString() {
        String string = "Petya ivanov";
        Assert.assertEquals(StringValidator.class, getValidator(string).getClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValidatorException() {
        Double dbl = new Double(3.66666);
        getValidator(dbl);
    }
}