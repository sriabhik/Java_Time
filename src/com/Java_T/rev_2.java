package com.Java_T;

import java.util.Scanner;
class  Solve_{
    void Rev(String str){
        for(int i = str.length()-1; i >=0 ;i--){
            System.out.print(str.charAt(i));
        }
    }
}
public class rev_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solve_ s = new Solve_();
        s.Rev(str);
    }
}
