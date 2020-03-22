package com.itclass.GenericHw.task1;

import org.junit.Assert;
import org.junit.Test;

public class IntegerValidatorTest {

    @Test
    public void testValidateTrue() {
        IntegerValidator validator = new IntegerValidator();
        Integer integer = new Integer(1);
        Assert.assertEquals(true, validator.validate(integer));
    }

    @Test
    public void testValidateFalse(){
        IntegerValidator validator = new IntegerValidator();
        Integer integer = new Integer(15);
        Assert.assertEquals(false, validator.validate(integer));
    }
}