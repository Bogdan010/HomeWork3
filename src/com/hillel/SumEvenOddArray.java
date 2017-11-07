package com.hillel;

public class SumEvenOddArray
{
    public static void main(String[] args)
    {
        int[] array = { -17, 36, -118, -117, 104, -7, -127, 80, 77, -8, 114, 81, 107, -2, -33, -41, -49, 83, -32, 56,
                        -71, -99, 19, 10, 89, -65, -53, -83, 87, 117, -25, 65, -27, 102, -77, 90, -126, -9, 72, -47, 70,
                        55, -123, -63, -86, -72, 71, -115, 60, -39, 73, -38, 17, -20, -94, 9, 41, -100, 123, -95, 8, 16,
                        34, 91, 88, -114, 38, -79, 27, 66, 122, 101, 57, -57, -128, 112, -74, 0, 22, -124, 40, -61, 76,
                        82, 46, -91, 64, -116, 23, 84, -10, 26, 45, -21, -13, -4, 67, -120, 98, -84, 125, 25, -58};

        int sumEven = 0, sumOdd = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0)
                sumEven += array[i];
            else
                sumOdd += array[i];
        }

        System.out.println("Sum of even element of array is " + sumEven);
        System.out.println("Sum od odd element of array is " + sumOdd);
    }
}
