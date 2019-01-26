package com.small_programs;

public class CreateArrayNPrint {
    public static void main(String[] args){
        int[] arr = new int[100];

        for(int i = 0;  i <100 ; i++){
            arr[i] = i + 1;
        }

        for(int temp : arr){
            System.out.println(temp);
        }
    }
}
