package com.Java_T;

import java.util.Scanner;

public class Lucky_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String s1 = "";
        for(int i = 0 ; i < str.length()/2;i++)
            s1 += str.charAt(i);
        String s2 = "";
        int l2 = str.length()/2;
        for(int i = str.length()/2;i < str.length();i++)
            s2 += str.charAt(i);
        boolean f1 = false;boolean f2 = false;boolean f3 = false;
        for(int i = 0 ; i < str.length()/2-1;i++){
            for(int j = 0 ; j < l2-1;i++){
                if((int)(s1.charAt(i)) > (int)(s2.charAt(j))) f1 = true;
                else if((int)(s1.charAt(i)) < (int)(s2.charAt(j))) f2 = true;
                else f3 = true;
            }
        }
        int count = 0;
        if(f1 == false)count++;
        if(f2 == false) count++;
        if(f3 == false) count++;
        System.out.println(count);

    }
}
