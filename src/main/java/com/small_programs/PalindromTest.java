package com.small_programs;

import java.util.Scanner;

public class PalindromTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int ip = sc.nextInt();
        int back = ip;
        int rem, res = 0;
        while(ip>0){
            rem= ip%10;  //getting remainder
            res=(res*10)+ rem;
            ip=ip/10;
        }

        if(back == res) {
            System.out.println("Palindrome number ");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
