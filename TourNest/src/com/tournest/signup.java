package com.tournest;

public class signup {
    //creating account
    String first_name;
    String last_name;
    String username;
    String phone_;
    String address_;
    String user_name;
    String user_pass;
    int key;

    signup(String first_name, String last_name, String username,
           String phone_, String address_, String user_name,
           String user_pass, int key) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.phone_ = phone_;
        this.address_ = address_;
        this.user_name = user_name;
        this.user_pass = user_pass;
        this.key = key;

    }
}
