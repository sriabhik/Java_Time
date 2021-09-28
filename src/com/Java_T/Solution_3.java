package com.Java_T;

import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int max_1 = Integer.MIN_VALUE;
        int min_1 = Integer.MAX_VALUE;
        while(n1 != 0){
            int temp = n1 % 10;
            max_1 = Math.max(temp,max_1);
            min_1 = Math.min(temp,max_1);
            n1 = n1 / 10;
        }
        int max_2 = Integer.MIN_VALUE;
        int min_2 = Integer.MAX_VALUE;
        while(n2 != 0){
            int temp = n2 % 10;
            max_2 = Math.max(temp,max_2);
            min_2 = Math.min(temp,max_2);
            n2 = n2 / 10;
        }
        int max_3 = Integer.MIN_VALUE;
        int min_3 = Integer.MAX_VALUE;
        while(n3 != 0){
            int temp = n1 % 10;
            max_3 = Math.max(temp,max_3);
            min_3 = Math.min(temp,max_3);
            n3 = n3 / 10;
        }
        System.out.println(max_1+max_2+max_3 - (min_1+min_2+min_3));
    }
}
