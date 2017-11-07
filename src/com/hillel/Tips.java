package com.hillel;

import java.util.Scanner;

public class Tips
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sum of money: ");
        int sum = scanner.nextInt();
        System.out.print("Enter service quality: ");
        String service = scanner.next();

        switch(service)
        {
            case "terrible":
                System.out.println("Tips will be " + sum * 0 + " $");
                break;
            case "poor":
                System.out.println("Tips will be " + sum * 0.05 + " $");
                break;
            case "good":
                System.out.println("Tips will be " + sum * 0.1 + " $");
                break;
            case "great":
                System.out.println("Tips will be " + sum * 0.15 + " $");
                break;
            case "excellent":
                System.out.println("Tips will be " + sum * 0.2 + " $");
                break;
            default:
                System.out.println("Error! Invalid service quality.");
        }
    }
}
