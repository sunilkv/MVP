package com.sunil.mvptut1.model;

public class Users {
    String email;
    String fullName;

    public Users() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return
                "Email=" + email +"\n"+ '\'' +
                "fullName=" + fullName + "\n"+ '\'' ;
    }


}
