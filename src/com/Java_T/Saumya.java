package com.Java_T;

import java.util.Scanner;

public class Saumya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
            if(i+1 >=l && i+1 <= r )
                sum += arr[i];
        }
        System.out.println(sum);
    }
}
