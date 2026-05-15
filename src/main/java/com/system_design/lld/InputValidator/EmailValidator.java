package com.system_design.lld.InputValidator;

public class EmailValidator implements Validator {

    @Override
    public boolean validate(String input) {
        return input.contains("@");
    }
}
