package com.jainish;

import java.util.Scanner;

// using switch case
public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num1: ");
        int a = sc.nextInt();

        System.out.println("Enter your operation: ");
        char op = sc.next().charAt(0);

        System.out.println("Enter your num2: ");
        int b = sc.nextInt();

        switch (op) {
            case '+':
                System.out.println("Your ans: " + (a + b));
                break;
            case '-':
                System.out.println("Your ans: " + (a - b));
                break;
            case '*':
                System.out.println("Your ans: " + (a * b));
                break;
            case '/':
                System.out.println("Your ans: " + (a / b));
                break;
            case '%':
                System.out.println("Your ans: " + (a % b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
