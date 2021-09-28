package com.Java_T;

import java.util.Scanner;

public class wipro_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int ans = 0;
        for(int i=0;i < n;i++){
            arr[i] = sc.nextInt();

        }
        for(int i=0;i < n;i++){
            if(arr[i] == k && k < arr[i])
                ans = i;
            else
                ans = i+1;

        }
        System.out.println(ans);

    }
}
