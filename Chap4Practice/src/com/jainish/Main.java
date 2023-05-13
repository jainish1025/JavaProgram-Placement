package com.jainish;
// Making a Calculater
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num a: ");
        int a = sc.nextInt();

        System.out.println("Enter your operator: ");
        char op = sc.next().charAt(0);

        System.out.println("Enter num b: ");
        int b = sc.nextInt();

        switch (op) {
            case '+': {
                System.out.println("Your ans :" + (a + b));
                break;
            }

            case '-': {
                System.out.println("Your ans :" + (a - b));
                break;
            }

            case  '*': {
                System.out.println("Your ans :" + (a * b));
                break;
            }

            case  '/': {
                System.out.println("Your ans :" + (a / b));
                break;
            }

            case  '%': {
                System.out.println("Your ans :" + (a % b));
                break;
            }

            default: {
                System.out.println("Please enter valid statement");
            }
        }
    }
}
