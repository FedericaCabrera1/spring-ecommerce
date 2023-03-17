package com.wardrobe.wardrobe.model;

import com.wardrobe.wardrobe.utils.enums.EUserType;

public class User {
    private Integer Id;
    private String name;
    private String username;
    private String email;

    private EUserType type;

    private String password;

    public User(Integer id, String name, String username, String email, EUserType type, String password) {
        Id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.type = type;
        this.password = password;
    }

    public User() {
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EUserType getType() {
        return type;
    }

    public void setType(EUserType type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Integer id) {
        Id = id;
    }
}
