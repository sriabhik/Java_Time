package com.Java_T;

import java.util.Scanner;

public class Coin_Chnge {
    public static int minCoins(int coins[], int M, int V) {
        if (V == 0) return 0;
        if (M == 0)
            return 234433223;

        System.out.println(V);
        if (coins[M - 1] > V)
            return minCoins(coins, M - 1, V);
        return Math.min(1 + minCoins(coins, M, V - coins[M - 1]), minCoins(coins, M-1, V ));
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        int V = sc.nextInt();
        int ans = minCoins(arr, n, V);
            System.out.println(ans);
    }
}
