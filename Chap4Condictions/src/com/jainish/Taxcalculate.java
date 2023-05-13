package com.jainish;

import java.util.Scanner;

public class Taxcalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if (income < 500000) {
            System.out.println("No Tax");
        }
        else if (income >= 500000 && income < 1000000 ) {
            System.out.println("Tax is :" + income*0.2);
        }
        else {
            System.out.println("Tax is :" + income*0.3);
        }
    }
}
