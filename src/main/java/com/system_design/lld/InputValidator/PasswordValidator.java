package com.system_design.lld.InputValidator;

public class PasswordValidator implements Validator {

    @Override
    public boolean validate(String input) {
        return input.length() >= 8;
    }
}
