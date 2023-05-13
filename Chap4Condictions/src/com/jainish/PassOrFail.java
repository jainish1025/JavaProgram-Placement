package com.jainish;

import java.util.Scanner;

// Check if a Student is pass or fail [Using ternary operator]
public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        // if marks >= 30 ; pass
        // else marks < 30 ; fail
        String check = (marks >= 33)? "Pass" : "Fail" ;
        System.out.println(check);
    }
}
