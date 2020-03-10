package com.itclass.GenericHw.task1;

public class StringValidator implements Validator<String> {

    public boolean validate(String s) {
        return s.matches("([A-Z]|[А-Я]).*");
    }
}
