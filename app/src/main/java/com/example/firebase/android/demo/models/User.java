package com.example.firebase.android.demo.models;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {

    public String username;
    public String email;
    public String appInstanceToken;

    public User() {
    }

    public User(String username, String email, String appInstanceToken) {
        this.username = username;
        this.email = email;
        this.appInstanceToken = appInstanceToken;
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

    public String getAppInstanceToken() {
        return appInstanceToken;
    }

    public void setAppInstanceToken(String appInstanceToken) {
        this.appInstanceToken = appInstanceToken;
    }
}
