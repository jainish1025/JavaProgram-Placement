package com.jainish;

public class Test1 {

    public static void main(String[] args) {
        int x = 2 , y = 5;

        int exp1 = (x * y / x);  // this will go to left to right
        int exp2 = (x * (y / x));  // this will go to right to left

        System.out.println(exp1 + " ,");
        System.out.println(exp2);
    }
}
