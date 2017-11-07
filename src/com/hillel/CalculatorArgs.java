package com.hillel;

public class CalculatorArgs
{
    public static void main(String[] args)
    {
        int a = Integer.getInteger(args[0]);
        int b = Integer.getInteger(args[1]);

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
