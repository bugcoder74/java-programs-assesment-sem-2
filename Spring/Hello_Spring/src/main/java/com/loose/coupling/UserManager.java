package com.loose.coupling;

// This file meant to use methods available in the Userdatabase class to get the user data

public class UserManager {

    private UserDataProvider udp;

    public UserManager(UserDataProvider x){
        this.udp = x;
    }
    public String getUserInfo(){
        return udp.getUserDetails();
    }
}
