package com.Java_T;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
class Solve_8{
    public int res(int [] arr,int ans){
        Set<Integer>  s = new HashSet<Integer>();
        for( int e : arr)
            s.add(e);
        for(int e : arr){
            int val = e;int c = 0;
            if(!s.contains(val-1)){
                while(s.contains(++val)){
                    c++;
                }
            if(c > ans) ans = c;
            }
        }
        return ans+1;
    }
}
public class L_Con_Seq_HT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        for(int i = 0 ; i < a ;i++){
            arr[i] = (sc.nextInt());
        }
        Solve_8  s = new Solve_8();
        System.out.println(s.res(arr,-1));
    }
}
