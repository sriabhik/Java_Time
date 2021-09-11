package com.Java_T;

import java.util.Arrays;
import java.util.Scanner;

public class Candie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int val = 0;
        int temp = 0;
        int ans = 0;
        int[] f = new int[n];
        Arrays.fill(f, -1);
        int i = 0;
        while (i < n - 1) {
            if(arr[i] < arr[i+1]){
                f[i] = 1;
                f[i+1] = f[i] + 1;
                i++;
            }
            else{
                f[i+1] = 1;
                i++;
            }
        }
        int  a= 0;
        for(int i1 = 0;i1 < n;i1++) {
            a += f[i1];
            System.out.println(f[i1]);
        }
        System.out.println(a);
    }
}
