package com.Java_T;

import java.util.Scanner;

public class Abhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n;i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for(int i = 0; i < n - 1;i++){
                int min_idx = i;
                for(int j = i+1 ; j < n ; j++){
                    if(arr[min_idx] > arr[j]){
                        min_idx = j;
                    }
                }
                if(min_idx != i){
                    count++;
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;


                }
            }
            System.out.println(count);
        }
    }
}
