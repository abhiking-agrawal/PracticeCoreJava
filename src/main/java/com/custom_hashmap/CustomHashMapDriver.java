package com.custom_hashmap;

import com.custom_hashmap.helpers.CustomHashMap;

public class CustomHashMapDriver {
    public static void main(String[] args) {
        CustomHashMap ipHM = new CustomHashMap();
//        ipHM.put("10", "A");
//        ipHM.put("11", "B");
        ipHM.put("12", "C");
//        ipHM.put("15", "R");
        System.out.println(ipHM.get("12"));
        ipHM.put("12", "D");


        System.out.println(ipHM.get("12"));
        System.out.println(ipHM.get("1"));

        System.out.println(ipHM);
    }
}
