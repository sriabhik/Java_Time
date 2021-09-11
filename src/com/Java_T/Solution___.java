package com.Java_T;

import java.util.Scanner;

public class Solution___ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0 ; i < n ; i++){
            ar[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int left = n- b;

        int[] ans = new int[n];
        int k = a;
        for(int i = b  ; i >= a;i--)
            ans[k++] = ar[i];
        for(int  i = 0; i < a;i++)
            ans[i] = ar[i];
        if(left >0){
            for(int i = left;i < n;i++)
                ans[i] = ar[i];
        }
        for(int i =0;i < n;i++)
            System.out.println(ans[i]);
    }
}
