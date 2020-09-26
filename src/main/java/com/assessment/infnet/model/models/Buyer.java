package com.assessment.infnet.model.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Buyer {
    public Integer id;
    public String email;
    public String socialSecurityNumber;
    public LocalDate birth;

    public Buyer() {}

    public Buyer(Integer id, String email, String socialSecurityNumber) {
        this();
        this.id = id;
        this.email = email;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setBirth(String birth) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.birth = LocalDate.parse(birth, dtf);
    }

    public LocalDate getBirth() {
        return this.birth;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
