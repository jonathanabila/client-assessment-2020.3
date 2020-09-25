package com.assessment.infnet.model.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Buyer {
    public Integer id;
    public String email;
    public String socialSecurityNumber;
    public LocalDate birth;

    public Buyer() {}

    public Buyer(Integer id, String email, String socialSecurityNumber, LocalDate birth) {
        this();
        this.id = id;
        this.email = email;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birth = birth;
    }

    public String getBirthString() {
        return birth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String toString() {
        return String.format(
                "%s;%s;%s",
                this.email,
                this.socialSecurityNumber,
                getBirthString()
        );
    }
}
