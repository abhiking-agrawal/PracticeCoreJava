package com.multithreadin_practice.helpers;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;

public class Thread1 implements Runnable {
    HashSet<Integer> hs;

    public void run() {
        System.out.println("Process"+Thread.currentThread().getId()+" Start:"+ new Timestamp(new Date().getTime()));
        addTOHashSet();
    }

    public void addTOHashSet(){
        hs = new HashSet<Integer>();
        for(int i =0; i < 200000; i++){
            hs.add(i);
        }
    }
}
