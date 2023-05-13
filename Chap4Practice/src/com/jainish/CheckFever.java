package com.jainish;

import java.util.Scanner;

// Write a program to check you a fever or not
public class CheckFever {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your body temperature: ");
        double temp = sc.nextDouble();

        if (temp > 100.00){
            System.out.println("You have Fever");
        }

        else {
            System.out.println("You don't have Fever");
        }
    }
}
