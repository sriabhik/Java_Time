package com.Java_T;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int c1 = 0;
        int c2 = 0;
        int val1 = n1;
        int val2 = n2;
        while(val1 != 0){
            c1++;
            val1  = val1 / 10;
        }
        while(val2 != 0){
            c2++;
            val2  = val2 / 10;
        }
        if(c1 > c2){

            int ans = n1 / 10;
            System.out.println(ans + n2);
        }
        else if(c1 < c2){
            int ans = n2/10;
            System.out.println(ans + n1);
        }
        else{
            System.out.println(n1+n2);
        }
    }
}
