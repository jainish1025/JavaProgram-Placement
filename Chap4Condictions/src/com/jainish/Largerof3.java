package com.jainish;
// Find the largest of 3 using if else and else if
public class Largerof3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        int c = 8;

        if (a >= b && a >= c) {
            System.out.println("A");
        } else if (b >= a && b >= c) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
