package com.Java_T;

import java.util.Scanner;

public class Solve_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans =0;
        int[] arr = new int[5];
        for(int i =0;i < 5;i++){
            int temp = sc.nextInt();
            if(i != 0)
                arr[i] = arr[i-1]+temp;
            else{
                arr[i] = temp;
            }
        }
        for(int ans1 :arr)
        System.out.println(ans1);
    }
}
