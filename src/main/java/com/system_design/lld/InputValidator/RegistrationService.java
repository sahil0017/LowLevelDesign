package com.system_design.lld.InputValidator;

import java.util.List;

public class RegistrationService {
    private final List<Validator> validators;

    public RegistrationService(List<Validator> validators) {
        this.validators = validators;
    }

    public void register(String input) {
        boolean allPassed = true;

        for(Validator validator : validators) {
            if (!validator.validate(input)) {
                allPassed = false;
                break;
            }
        }
        System.out.println("\"" + input + "\" - " + (allPassed ? "PASSED" : "FAILED"));
    }
}
