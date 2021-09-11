package com.Java_T;

import java.util.Scanner;

public class Group {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        if( n % 2 == 0){
            ans = n /2;
            for(int i =0;i < 4;i++){
                System.out.print(ans + " ");
            }
        }
        else{
            int temp = n /4;
            ans = n - temp*3;
            for(int i =0 ; i < 3;i++)
                System.out.print(temp + " ");
            System.out.print(ans);
        }
    }
}
