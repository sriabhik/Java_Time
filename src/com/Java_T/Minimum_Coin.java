package com.Java_T;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0 ; i< n ;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        int count = 0;int ans = 0;
        for(int i = n-1 ; i >=0 ; i--){
            if(arr[i] % k == 0)
                count++;
            if(count == 2){
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
