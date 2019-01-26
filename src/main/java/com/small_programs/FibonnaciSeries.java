package com.small_programs;

public class FibonnaciSeries {
    public static void main(String[] args) {

        int n = 15, t1 = 0, t2 = 1;
        System.out.print("Series : ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + ", ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
