package com.small_programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int ip = Integer.parseInt(args[0]);
        System.out.println("Input Number : " + ip);
        int back = ip;
        int rem, res = 0;
        while(ip>0){
            rem= ip%10;  //getting remainder
            res += ( rem * rem * rem);
            ip=ip/10;
        }

        if(back == res) {
            System.out.println("Armstrong number ");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
