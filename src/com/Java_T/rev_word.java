package com.Java_T;

import java.util.Scanner;
class Solve_1 {
    public String Rev(String s) {
        int i = s.length()-1;

        StringBuilder sb = new StringBuilder();
        while(i >= 0)
        {
            while(i >= 0 && s.charAt(i) == ' ')
            {
                i--;
            }
            int j = i;
            while(i >= 0 && s.charAt(i) != ' ')
            {
                i--;
            }
            if(j != i)// "  hello world  "->this example to understand this condition,to remove white space at starting
                sb.append(s.substring(i+1,j+1) + " ");
        }
        sb.setLength((sb.length()-1));
        return sb.toString();

    }
}
public class rev_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solve_1 s = new Solve_1();
        String res = s.Rev(str);
        System.out.println(res);
    }
}
