package com.jainish;

import java.util.Scanner;

// Write a program to print number is Odd or Even using if,else statement
public class OddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number%2==0) {
            System.out.println("Number is Even");
        }

        else {
            System.out.println("Number is Odd");
        }
    }
}
