package com.jainish;

import java.util.Scanner;

// Write a java program to get a number is positive or negative
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0){
            System.out.println("Your number is Positive");
        }
        else {
            System.out.println("Your number is  Negative");
        }
    }
}
