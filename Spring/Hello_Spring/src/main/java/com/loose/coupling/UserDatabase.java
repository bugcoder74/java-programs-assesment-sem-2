package com.loose.coupling;

public class UserDatabase implements UserDataProvider {
    @Override
    public String getUserDetails(){
        // Now implement the code to get data
        return "Some User Information";
    }
}
