package com.Java_T;

import java.util.Scanner;

public class Island_Sur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int ans = 0;
            int  s = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(m > n){
                System.out.println(-1);
            }
            else{
                int temp = s *m;
                int count = 1;
                int val = n;
                while(n < temp){
                    n = n + val;
                    count++;
                }
                System.out.println(count);
            }

        }
    }
}
