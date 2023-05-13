package com.jainish;

import java.util.Scanner;

// make a Wending machine using switch statement
public class WendingMAchin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Wending Machine");
        System.out.println("Enter the button number: ");
        int button = sc.nextInt();

        switch (button) {
            case 1 :
                System.out.println("You Enter Button 1 you get MilkShake");
                break;
            case 2 :
                System.out.println("You Enter Button 2 you get Cold Drink");
                break;
            case 3 :
                System.out.println("You Enter Button 3 you get Banana Shake");
                break;
            case 4 :
                System.out.println("You Enter Button 4 you get Coffee");
                break;
            case 5 :
                System.out.println("You Enter Button 5 you get Strawberry Shake");
                break;

            default:
                System.out.println("Please Enter Valid Button");
        }
    }
}
