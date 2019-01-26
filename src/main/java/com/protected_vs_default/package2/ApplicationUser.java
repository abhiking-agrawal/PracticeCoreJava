package com.protected_vs_default.package2;

import com.protected_vs_default.package1.User;

public class ApplicationUser extends User {

    public static void main(String args[]){
        ApplicationUser app = new ApplicationUser();

        System.out.println(app.getName());

        //Uncomment to check the default method error
        //String callDeafaultMethod = app.callDefaultMethod();
    }
}
