package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider dbProvider = new UserDatabase(); // object of interface but new of UserDatabase that keeps implementation
        UserManager um = new UserManager(dbProvider);
        System.out.println(um.getUserInfo());

        UserDataProvider mongoDb = new newMongoDBProvider();
        UserManager um_mongo = new UserManager(mongoDb);
        System.out.println(um_mongo.getUserInfo());
    }
}
