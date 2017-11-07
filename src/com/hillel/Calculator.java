package com.hillel;

public class Calculator
{
    public static void main(String[] args)
    {
	    int a = 12;
	    int b = -4;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("|a| = " + Math.abs(a));
        System.out.println("|b| = " + Math.abs(b));
    }
}
