package com.Java_T;

import java.util.Scanner;

public class Add_Subtract {
    static  boolean is_Prime(int  n){
        if(n == 1)return false;
        for(int i = 2;i < Math.sqrt(n);i++){
            if(n % i == 0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rev = 0;
        while(n1 != 0){
            int t = n1 % 10;
            rev = rev *10+ t;
            n1 = n1/10;
        }
        if(is_Prime(n2))
            System.out.println(n2 + rev);
        else
            System.out.println(n2-rev);
    }
}
