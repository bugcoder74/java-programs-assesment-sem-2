package com.loose.coupling;

public class newMongoDBProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return "New way to fetch from mongoDB";
    }
}
