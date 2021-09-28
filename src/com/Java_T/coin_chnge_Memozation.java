package com.Java_T;

import java.util.Scanner;

public class coin_chnge_Memozation {
    int dp[][];
    public int coinChange(int[] coins, int amount) {
        int n=coins.length-1;
        dp=new int[amount+1][coins.length+1];
        for(int i=0 ; i<dp.length ; i++){
            for(int j=0 ; j<dp[0].length ; j++){
                dp[i][j]=-1;
            }
        }
        int ans= help(coins,amount,n);
        if(ans==231456789)
            ans=-1;
        return ans;

    }
    public int help(int[] coins , int amount , int n){
        //System.out.println(amount);
        if(amount==0)
            return 0;
        if(n<0)
            return 231456789;
        if(dp[amount][n]!=-1)
            return dp[amount][n];
        if(coins[n]<=amount)
            return  dp[amount][n]=  Math.min(1+help(coins,amount-coins[n],n),help(coins,amount,n-1));

        else
            return dp[amount][n]=   help(coins,amount,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        int V = sc.nextInt();
        coin_chnge_Memozation s = new coin_chnge_Memozation();
        int ans = s.coinChange(arr,V);

        System.out.println(ans);
    }
}