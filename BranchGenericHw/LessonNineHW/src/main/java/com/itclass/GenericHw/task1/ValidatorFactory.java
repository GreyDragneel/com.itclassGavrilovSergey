package com.itclass.GenericHw.task1;

public class ValidatorFactory {

    public static Validator getValidator(Object object){
        if (object instanceof Integer){
            return new IntegerValidator();
        } else if (object instanceof String){
            return new StringValidator();
        } else {
            throw new IllegalArgumentException("Invalid input type");
        }
    }
}
