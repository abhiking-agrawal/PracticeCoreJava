package com.runtime_polymorphism;

import com.runtime_polymorphism.helpers.Child;
import com.runtime_polymorphism.helpers.Parent;

public class RuntimePolyDriver {


    public static void main(String[] args){
        Parent parent = new Child();   //castin to parent object

        //due to runtime polymorphism it will call the getName method from child class
        System.out.println("Called : " + parent.getName());
    }


}
