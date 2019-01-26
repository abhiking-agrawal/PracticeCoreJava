package com.exception_handeling;

import com.exception_handeling.helpers.NumberGreaterThanZero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionDriver {

    public static void main(String[] args) throws InputMismatchException, NumberGreaterThanZero {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int ip;
        try{
            ip = sc.nextInt();

            if(ip < 0){
                throw new NumberGreaterThanZero("Number should be greater than Zero");
            }
        }catch (NumberGreaterThanZero e) {
            System.out.println( "NumberGreaterThanZero Exception : " + e.getStackTrace());
        }catch (InputMismatchException e) {
            System.out.println( "Input Mismatch Exception : " + e.getStackTrace());
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }finally {
            System.out.println("Program Executed successfully..............");
        }


    }
}
