package com.hillel;

import java.util.Scanner;

public class CalculatorConsole
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first operand(a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second operand(b): ");
        int b = scanner.nextInt();
        System.out.print("Enter operation: ");
        String c = scanner.next();

        switch(c)
        {
            case "+":
                System.out.println("a + b = " + (a + b));
                break;
            case "-":
                System.out.println("a - b = " + (a - b));
                break;
            case "*":
                System.out.println("a * b = " + (a * b));
                break;
            case "/":
                System.out.println("a / b = " + (a / b));
                break;
            case "%":
                System.out.println("a % b = " + (a % b));
                break;
            case "|":
                System.out.println("|a| = " + Math.abs(a));
                System.out.println("|b| = " + Math.abs(b));
                break;
            default:
                System.out.println("Invalid char!");
        }
    }
}
