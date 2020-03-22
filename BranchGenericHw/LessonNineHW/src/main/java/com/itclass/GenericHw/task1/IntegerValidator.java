package com.itclass.GenericHw.task1;

public class IntegerValidator implements Validator<Integer> {

    @Override
    public boolean validate(Integer integer) {
        if (integer > 0 & integer < 11){
            return true;
        } else {
            return false;
        }

    }
}
