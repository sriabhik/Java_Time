package com.Java_T;

import java.util.Scanner;

public class Cgpa{

    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            int curr = (str.charAt(i) + (int) (str.charAt(i) % 26) );
            if(curr > 123)
                curr = 97 + curr - 123;
            res += (char)curr;
        }
        System.out.println(res);
    }
}
