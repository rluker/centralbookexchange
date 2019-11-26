package com.centralbookexchange.webapp.model;

import javax.validation.constraints.*;

public class Email {

    @NotBlank
    private String userEmail;

    public String getEmail() {
        return this.userEmail;
    }
}
