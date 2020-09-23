package com.assessment.infnet.model.models;


public class User {
    private Integer id;
    private String userName;
    private String password;

    public User() {}

    public User(String userName, String password) {
        this();
        this.userName = userName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
