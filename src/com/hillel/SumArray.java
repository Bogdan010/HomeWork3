package com.hillel;

import java.util.Scanner;

public class SumArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N elements of array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter number of element #" + i + " ");
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println("Sum of N elements of array is " + sum);
    }
}
