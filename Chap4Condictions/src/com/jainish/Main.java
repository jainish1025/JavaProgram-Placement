package com.jainish;

import java.util.Scanner;

//Write a program to if you are 18+ or not ( using if,else statement )
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You can drive a car and do voting");
        }

        if (age > 13 && age < 18){
            System.out.println("Yor are a teenager");
        }

        else {
            System.out.println("You are not Adult");
        }
    }
}
