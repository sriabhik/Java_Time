package com.Java_T;


import java.util.Scanner;

public class Laptop_Buy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i1 = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n ; i++)
            arr[i] = sc.nextInt();

        int count = 0;
        int num = n;
        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }
        if(count == i1)
        System.out.println("True " + count);
        else
            System.out.println("False "+count);

    }
}
