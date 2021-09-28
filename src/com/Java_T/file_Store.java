package com.Java_T;

import java.util.Scanner;

public class file_Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++)
        {
            int temp = sc.nextInt();
            int ans = 0;
            while(temp != 0){
                int l = temp % 10;
                ans += l;
                temp = temp / 10;
            }
            arr[i] = ans;
        }
        for(int a : arr)
            System.out.print(a + " ");
    }
}

