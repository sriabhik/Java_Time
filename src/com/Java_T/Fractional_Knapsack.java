package com.Java_T;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Data{
    int val;int wt;int ratio;
    Data(int v,int w,int r){
        val = v;wt = w;ratio = r;
    }
}
class mycomparator_1 implements Comparator<Data>{
    @Override
    public int compare(Data d1,Data d2){
        if(d1.ratio < d2.ratio)
            return 1;
        else if(d1.ratio > d2.ratio)
            return -1;
        return  0;
    }
}
public class Fractional_Knapsack {
    public static void  Fractional_K(ArrayList<Integer> val,ArrayList<Integer> wt,int n ,int W){
        ArrayList<Data> t = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            t.add( new Data(val.get(i),wt.get(i),(int)((int)val.get(i)/(int)wt.get(i))));
        }
        mycomparator_1 mc = new mycomparator_1();
        Collections.sort(t,mc);int ans = 0;
        for(int i = 0 ; i < n ;i++){
            System.out.println(t.get(i).ratio);
        }
        int temp_w = W;
        for(int i = 0 ; i < n ;i++){
            if(temp_w <= 0){
                break;
            }
            else if(t.get(i).wt <= temp_w ){
                ans += t.get(i).val;
                temp_w = temp_w - t.get(i).wt;
            }
            else {

                ans += (int)(temp_w*t.get(i).ratio);
                temp_w = temp_w - t.get(i).wt;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        ArrayList<Integer> val = new ArrayList<>();
        ArrayList<Integer> wt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ;i++){
            val.add(sc.nextInt()) ;
            wt.add(sc.nextInt())  ;
        }
        int W = sc.nextInt();

        Fractional_K(val,wt,n,W);
    }
}
