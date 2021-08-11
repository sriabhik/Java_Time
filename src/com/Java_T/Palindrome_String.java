package com.Java_T;


import java.util.Scanner;
class Solve_3{

    int Rev(String str,int l,int h){
        if(h < 0 || l > h)
            return 0;
        else if(h == 1 || h == 0)
            return  1;
        else if(str.charAt(l) == str.charAt(h) && l != h)
            return (2 + Rev(str,l+1,h-1));
        return Math.max(Rev(str,l,h-1),Rev(str,l+1,h));
    }
}
public class Palindrome_String {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            Solve_3 s = new Solve_3();
            int val = s.Rev(str,0,str.length()-1);
            System.out.println(val);
        }

    }
}
