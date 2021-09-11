package com.Java_T;

import java.util.ArrayList;
import java.util.Scanner;

public class Non_Prime {
    static  boolean is_Prime(int  n){
        if(n == 1)return false;
        for(int i = 2;i < Math.sqrt(n);i++){
            if(n % i == 0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = a ; i <= b ;i++){
            if(!is_Prime(i))
                ans.add(i);
        }
        for(Integer arr : ans)
            System.out.print (arr + " ");

    }
}
