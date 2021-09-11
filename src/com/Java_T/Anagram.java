package com.Java_T;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int i;
        for(i =0 ; i < str1.length();i++) {
            if(c1[i] != c2[i])
                System.out.println("Not Anagram");
        }
        if(i == str1.length())
            System.out.println("Anagram");
    }
}
