package com.jainish;

import java.util.Scanner;

public class Leapear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
//
//        if (year % 4 == 0){
//            System.out.println("Your year is Leapear");
//        }
//        else {
//            System.out.println("Your year is not Leapear");
//        }

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) &&(year % 400 == 0 ));

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }

    }
}
