package com.Java_T;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        k++;
        int ans = k;
        boolean f = false;
        while(f != true){
            for(int i = 0 ; i < n;i++){
                if(k % arr[i] == 0){
                    ans = k;
                    f = true;
                    break;
                }
            }
            k++;
        }
        System.out.println(ans);
    }
}
