package com.protected_vs_default.package1;

public class User {
    protected  String getName(){
        System.out.println("Calling protected getName method");
        return "user class: protected method";
    }

    String callDefaultMethod(){
        return "user class : default method";
    }
}
