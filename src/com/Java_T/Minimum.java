package com.Java_T;

import java.util.Scanner;

class Minimum{

    public static int minSum(int a[], int b[], int n)
    {

        int minA = a[0], indexA = 0;
        for (int i=1; i<n; i++)
        {
            if (a[i] < minA)
            {
                minA = a[i];
                indexA = i;
            }
        }


        int minB = b[0], indexB = 0;
        for (int i=1; i<n; i++)
        {
            if (b[i] < minB)
            {
                minB = b[i];
                indexB = i;
            }
        }


        if (indexA != indexB)
            return (minA + minB);


        int minA2 = Integer.MAX_VALUE, indexA2 = 0;
        for (int i=0; i<n; i++)
        {
            if (i != indexA && a[i] < minA2)
            {
                minA2 = a[i];
                indexA2 = i;
            }
        }


        int minB2 = Integer.MAX_VALUE, indexB2 = 0;
        for (int i=0; i<n; i++)
        {
            if (i != indexB && b[i] < minB2)
            {
                minB2 = b[i];
                indexB2 = i;
            }
        }

        return Math.min(minB + minA2, minA + minB2);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int[] b = new int[n];
        for(int i =  0 ;i < n ; i++)
            a[i] = sc.nextInt();
        for(int i = 0 ; i< n ;i++)
            b[i] = sc.nextInt();



        System.out.print(minSum(a, b, n));
    }
}