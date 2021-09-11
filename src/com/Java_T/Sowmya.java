package com.Java_T;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sowmya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n ;i++)
            arr[i] = sc.nextInt();
        Set<Integer> ans = new HashSet<>();
        for(int i = 0 ;i < n ;i++){
            int p = 1;
            int val = arr[i];
            if(arr[i] < 0)
            {
                val = -arr[i];
            }
            while(val != 0){
                int temp = val % 10;
                p = p *temp;
                val = val / 10;
            }
            if(arr[i] < 0)
                p = -p;
            ans.add(p);
        }
        System.out.println(ans.size());
    }
}
