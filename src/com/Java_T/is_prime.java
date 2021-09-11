package com.Java_T;

import java.util.ArrayList;
import java.util.Scanner;

public class is_prime {
    static  boolean is_Prime(int  n){
        if(n == 1)return false;
        for(int i = 2;i < Math.sqrt(n);i++){
            if(n % i == 0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1 ; i <= n; i++){
            if( n % i == 0)
                arr.add(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.size();i++){
            if(is_Prime(arr.get(i))){
                ans.add(arr.get(i));
            }
        }
        for(int i = 0 ; i < ans.size() ; i++){
            System.out.println(ans.get(i));
        }
    }
}
