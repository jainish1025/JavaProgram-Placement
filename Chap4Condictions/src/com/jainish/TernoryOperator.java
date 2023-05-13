package com.jainish;
import java.util.Scanner;

// write a Program to print age is 18+ or not using ternory operator
public class TernoryOperator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int age = 18;
        String ans = (age >= 18) ? "You are adult" : "You are not adult";
        System.out.println(ans);

        // Number is Even or Odd
        int num = sc.nextInt();
        String number = (num%2==0) ? "Even" : "Odd";
        System.out.println(number);
    }
}
