package com.Java_T;

import java.util.LinkedList;

import java.util.Scanner;
import java.util.Queue;

class Solve_2{
    public  void Rev(String str){
        Queue<String> s = new LinkedList<>();
        int i = str.length()-1;
        while (i >= 0){
            while (i >=0 && str.charAt(i) == ' '){
                i--;
            }
            int j = i;
            while(i >= 0 && str.charAt(i) != ' '){
                i--;
            }
            if(j!= i){
                s.add(str.substring(i+1,j+1));s.add(" ");
            }

        }
        while(!s.isEmpty())
            System.out.print(s.poll());

    }
}
public class word_rev_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solve_2 s = new Solve_2();
        s.Rev(str);

    }
}
