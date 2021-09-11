package com.Java_T;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Healthy_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] arr = new int[n];
            for(int i =0; i < n;i++){
                arr[i] = sc.nextInt();
            }
            while(q-- != 0){
                int count = 0;
                int a = sc.nextInt();
                int b = sc.nextInt();
                ArrayList<Integer> ar = new ArrayList<>();
                for(int i = 0; i < n;i++){
                    if(a <= arr[i] || b >= arr[i]){
                        count++;
                        ar.add(i);
                    }
                }
                System.out.println(count);
                //for(Integer ap :  arr) System.out.print(ap + " ");

            }
        }
    }
}
