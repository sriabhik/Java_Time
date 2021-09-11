package com.Java_T;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       for(int i =0;i<n;i++) {
           for(int j = 0;j <=i;j++) {
               if (i % 2 == 0)
                   System.out.print("*");
               else
                   System.out.print("2");
           }
           System.out.println();
       }
    }
}
