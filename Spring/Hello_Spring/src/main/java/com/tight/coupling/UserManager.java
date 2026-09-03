package com.tight.coupling;

// This file meant to use methods available in the Userdatabase class to get the user data

public class UserManager {

    private UserDatabase ud = new UserDatabase();
    public String getUserInfo(){
        return ud.getUserDetails();
    }
}
