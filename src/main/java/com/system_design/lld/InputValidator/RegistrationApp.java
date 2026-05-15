package com.system_design.lld.InputValidator;

import java.util.List;

public class RegistrationApp {
    static void main(String []args) {

        List<Validator> emailValidators = List.of(new EmailValidator());
        RegistrationService emailRegistration = new RegistrationService(emailValidators);

        emailRegistration.register("kanungosahil123@gmail.com");
        emailRegistration.register("sahil.kanungo@gmail.com");
        emailRegistration.register("1941012734.t.sahilkanungo@gmail.com");


        List<Validator> compositeValidators = List.of(new EmailValidator(), new PasswordValidator());
        RegistrationService compositeRegistration = new RegistrationService(compositeValidators);

        compositeRegistration.register("kanungosahil123@gmail.com");
        compositeRegistration.register("sahil.89036789");




    }
}
