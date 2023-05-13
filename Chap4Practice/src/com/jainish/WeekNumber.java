package com.jainish;

import java.util.Scanner;

// Write a java program to input  week (1-7) and print if eek name using switch case
public class WeekNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        switch (number){
                case 1:
                System.out.println("Monday");
                break;

                case 2:
                System.out.println("Tuesday");
                break;

                case 3:
                System.out.println("Wednesday");
                break;

                case 4:
                System.out.println("Thursday");
                break;

                case 5:
                System.out.println("Friday");
                break;

                case 6:
                System.out.println("Saturday");
                break;

                case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter valid number of Week");


        }
    }
}
