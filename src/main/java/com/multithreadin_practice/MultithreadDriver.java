package com.multithreadin_practice;

import com.multithreadin_practice.helpers.Thread1;

import java.sql.Timestamp;
import java.util.Date;

public class MultithreadDriver {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        System.out.println("Process1 Start:"+ new Timestamp(new Date().getTime()));
        t1.addTOHashSet();
        System.out.println("Process2 Start:"+ new Timestamp(new Date().getTime()));
        t2.addTOHashSet();
        System.out.println("Processes Ends:"+ new Timestamp(new Date().getTime()));


        System.out.println("Using Multithreading");

        Thread o1 = new Thread(new Thread1());
        Thread o2 = new Thread(new Thread1());

        o1.start();

        o2.start();

    }

}
