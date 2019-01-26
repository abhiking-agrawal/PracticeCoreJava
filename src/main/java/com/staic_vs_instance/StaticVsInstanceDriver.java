package com.staic_vs_instance;

public class StaticVsInstanceDriver {

    public static void main(String[] args) {
        //we can access the static variable without object

        CarHelper.price = 1000;
        System.out.println("Car Price : " + CarHelper.price);

        //demo instance variable

        CarHelper c1 = new CarHelper("Red");
        CarHelper c2 = new CarHelper("Blue");

        System.out.println("Car 1 color : " + c1.getColor());
        System.out.println("Car 2 color : " + c2.getColor());
    }

}
