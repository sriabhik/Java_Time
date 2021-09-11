package com.Java_T;

import java.util.Scanner;

public class Prime_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            String str = sc.next();
            String odd = "";
            String even = "";
            for(int i =0;i < str.length();i++){
                if(i % 2 == 0)
                    odd += str.charAt(i);
                else
                    even += str.charAt(i);
            }
            int sum1 =0;
            int sum2 = 0;
            for(int i = 0 ; i < odd.length();i++)
                sum1 += (int)(odd.charAt(i));
            for(int i = 0 ; i < even.length();i++)
                sum2 += (int)(even.charAt(i));
            int res = Math.abs(sum1-sum2);
            if((res % 3 == 0) || (res % 5 == 0) || (res % 7) == 0)
                System.out.println("Prime String");
            else
                System.out.println("Casual String");
        }
    }
}
