package com.itclass.GenericHw.task1;


import static com.itclass.GenericHw.task1.ValidatorFactory.getValidator;

public class ValidationSystem {

    private Validator validator;

    public boolean validate(Object object) throws ValidationFailedException{
        validator = getValidator(object);
        if(validator.validate(object)){
            return true;
        } else{
            throw new ValidationFailedException("Validation failed");
        }
    }
}