package com.Java_T;

import java.util.Scanner;

public class Land_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 0;i < n ;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a >= L && b >=L &&(a == b))
                System.out.println("Got it");
            else if( a < L || b < L)
                System.out.println("New One");
            else
                System.out.println("Sorry");
        }
    }
}
