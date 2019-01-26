package com.small_programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String ip = sc.nextLine();
        String res = "";
        for(int i = ip.length()-1; i>=0; i--){
           res += ip.charAt(i);
        }
        System.out.println( "Reversed String : " + res);
    }
}
