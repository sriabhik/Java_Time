package com.Java_T;

import java.util.Scanner;

public class Main__ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cmp = n;
        int ans = 0;
        while(n != 0){
            int temp = n % 10;
            ans += temp;
            n = n/10;
        }

        if(Math.pow(ans,2) == cmp){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
