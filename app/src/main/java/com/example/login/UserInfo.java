package com.example.login;

public class UserInfo {
    private String name,email,mobile,password;

    public UserInfo(String mobile) {
        this.mobile = mobile;
    }

    public UserInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public UserInfo(String name, String email, String mobile,String password) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.password =password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
