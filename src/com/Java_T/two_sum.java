package com.Java_T;

import java.util.ArrayList;
import java.util.Scanner;
class Solve_6{
    public  ArrayList<Integer> two_sum(ArrayList<Integer> arr,int n,int i,int j,int sum,ArrayList<Integer> res){

        if(sum == 0)
        {
            res.add(i);res.add(j);
            return  res;
        }
        if(n == 0) return res;
        else if(arr.get(n-1) > sum)
            return two_sum(arr,n-1,i,j,sum,res);
        else{
            if( j == -1){
                two_sum(arr,n-1,i,n-1,sum-arr.get(n-1),res);
                two_sum(arr,n-1,i,j,sum,res);
            }else {
                two_sum(arr,n-1,n-1,j,sum-arr.get(n-1),res);
                two_sum(arr,n-1,i,j,sum,res);
            }
        }
        return res;
    }
}
public class two_sum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0 ; i < a ;i++){
            arr.add(sc.nextInt());
        }
        int sum = sc.nextInt();
        Solve_6 s = new Solve_6();
        ArrayList<Integer> res = new ArrayList<>();
        System.out.println(s.two_sum(arr,a,-1,-1,sum,res));
    }
}
