package com.tight.coupling;

public class TightCouplingExample {
    public static void main(String[] args) {
        UserManager UM =  new UserManager();
        System.out.println(UM.getUserInfo());
    }
}
