package com.small_programs;

public class PascalTriangle {
    public static void main(String[] args){
        for(int lineNo = 1; lineNo <= 5; lineNo++)
        {
            int cf=1;
            for(int i = 1; i <= lineNo; i++)
            {
                System.out.print(cf+" ");
                cf = cf * (lineNo - i) / i;
            }
            System.out.println();
        }
    }
}
