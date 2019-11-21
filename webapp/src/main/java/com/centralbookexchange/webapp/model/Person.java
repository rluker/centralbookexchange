package com.centralbookexchange.webapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import java.io.*;
import java.util.UUID;


public class Person implements Serializable {

    private final int id;
    @NotBlank
    private String fName;
    @NotBlank
    private String lName;
    @NotBlank
    private String email;

    public Person(@JsonProperty("id") int id,
                  @JsonProperty("fName")String fName,
                  @JsonProperty("lName")String lName,
                  @JsonProperty("email")String email) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public void setfName(String fname) {
        this.fName = fName;
    }

    public void setlName(String lname) {
        this.lName = lName;
    }

    public void setEmail(String email) {

        this.email = email;
    }

}
