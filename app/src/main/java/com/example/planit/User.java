package com.example.planit;

public class User {
    private String name;
    private String username;
    private String password;

    public User(String n, String u, String p) {
        name = n; username = u; password = p;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
