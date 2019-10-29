package com.centralbookexchange.webapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Person {

    private final UUID id;
    @NotBlank
    private final String fName;
    @NotBlank
    private final String lName;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("fName")String fName,
                  @JsonProperty("lName")String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    public UUID getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

}
