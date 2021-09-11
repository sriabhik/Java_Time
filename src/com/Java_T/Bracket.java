package com.Java_T;

import java.util.Scanner;

public class Bracket{

    public static String matchBrackets(String brackets){

        int open = 0;
        int count =0;

        for(int i=0;i<brackets.length();i++){
            if(brackets.charAt(i)=='{'){
                open++;
            }else if(brackets.charAt(i)=='}'){
                count++;
            }

        }
        if(open== count)
            return "correct";
        return "error";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(matchBrackets(str));
    }}
