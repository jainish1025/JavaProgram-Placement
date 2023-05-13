package com.jainish;
//Assignment Operators
public class AssignmentOperator {
    public static void main(String[] args) {
//          int a = 10;
//          int b = 20;
//          int c = 0;
//          c = a + b;
//          System.out.println("c = a + b = " + c);
//          c += a;
//          System.out.println("c += a = " + c);
//          c -= a;
//          System.out.println("c -= a = " + c);
//          c *= a;
//          System.out.println("c *= a = " + c);
//          a = 10;
//          c = 15;
//          c /= a;
//          System.out.println("c /= a = " + c);

//          a = 10;
//          c = 15;
//          c %= a;
//          System.out.println("c %= a = " + c);
//          c <<= 2;
//          System.out.println("c <<= 2 = " + c);
//          c >>= 2;
//          System.out.println("c >>= 2 = " + c);
//          c >>= 2;
//          System.out.println("c >>= a = " + c);
//          c &= a;
//          System.out.println("c &= 2 = " + c);
//          c ^= a;
//          System.out.println("c ^= a = " + c);
//          c |= a;
//          System.out.println("c |= a = " + c);


         //Addtion
         int a = 10;
//       int b = a+10;
         a += 10;         //this is also correct but this will execute fast in java
        System.out.println(a);

         //Subtraction
        int b = 5;
//      b = b - 5;
        b -=5;      //this is also correct but this will execute fast in java
        System.out.println(b);

        //multiplication
        int c = 10;
//      c = c * 10;  //this is correct
        c *=5;      //this is also correct but this will execute fast in java
        System.out.println(c);

        //Division
        int d = 20;
//      d = d / 20;  //this is correct
        d /=20;      //this is also correct but this will execute fast in java
        System.out.println(d);

        //Modulo
        int e = 14;
//      e = e % 14;  //this is correct
        e %=14;      //this is also correct but this will execute fast in java
        System.out.println(e);

    }
}
