package com.small_programs;

public class BubbleSort {
    void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static void main(String args[])
    {
        BubbleSort bs = new BubbleSort();
        int[] arr = {13, 12, 33, 12, 221, 11, 290};
        System.out.println("Input array");
        for(int i : arr){
            System.out.print(i +", ");
        }
        bs.bubbleSort(arr);
        System.out.println("Sorted array");
        for(int i : arr){
            System.out.print(i +", ");
        }
    }
}
