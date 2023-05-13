package com.jainish;
// write a Program to print age is 18+ or not using if else, else if statement
import java.util.Scanner;

public class ElseifStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You are adult");
        } else if (age >=13 && age <=18) {
            System.out.println("You are Teenger");
        } else {
            System.out.println("You are not adult");
        }

    }
}
