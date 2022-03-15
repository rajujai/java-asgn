package com.raju.q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static String check(int n) throws NullStringException {
        if(n > 10) return "Welcome to Exception Handling";
        else throw new NullStringException("String value is null");
    }

    public static void main(String[] args) {
        System.out.println("start of main..");
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        String message = null;
        try{
            System.out.println("Enter num1");
            num1 = sc.nextInt();
            System.out.println("Enter num2");
            num2 = sc.nextInt();
            int num3 = num1 / num2;
            message = check(num3);
            System.out.println("Message is :"+message.toUpperCase());
        }
        catch (InputMismatchException ie){
            System.out.println("Please enter valid number");
        }
        catch (ArithmeticException ae){
            System.out.println("num2 should not be 0");
        }
        catch (NullStringException ne){
            System.out.println(ne.getMessage());
        }
        System.out.println("end of main");
    }
}
