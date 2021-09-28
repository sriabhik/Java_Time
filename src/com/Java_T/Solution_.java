package com.Java_T;

import java.util.Scanner;

public class Solution_ {
        public static long fact(int n) {
            long fact = 1;
            for (int i = 2; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            long ans = fact(a);

            if(ans % 10 != 0)
                System.out.println(ans%10);
            else{
                long temp = ans  /10;
                boolean f = true;
                while(f){
                    if(temp % 10 != 0)
                    {
                        System.out.println(temp%10);
                        break;
                    }
                    temp = temp/10;
                }
            }

        }
}
