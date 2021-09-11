package com.Java_T;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set<Integer> ans = new HashSet<>();
        int count = 0;
        for(int i =0;i < str.length();i++){
            if(count == 2){
                int k  = i;
                String s = "";
                while(k < i+4){
                    s += str.charAt(k++);
                }
                int p = Integer.parseInt(s);
                ans.add(p);
                count = 0;

            }
            else if(str.charAt(i) == '-'){
                count++;

            }

        }
        System.out.println(ans.size());
    }
}
