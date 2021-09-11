package com.Java_T;

import java.util.*;

public class Employee_replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i< n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> c = new HashMap<>();
        int i = 0;int j =0;
        while(i < k){
            if(!c.containsKey(arr[j])){
                c.put(arr[j],1);
                ans.add(arr[j]);

                i++;
            }
            j++;
        }

        for(int l = j ;l < n ;l++){
            //System.out.print(arr[l] + " ");
            if(!c.containsKey(arr[l])){
                System.out.println(c.get(c.size()-1));
                c.put(arr[l],c.remove(c.keySet()));
                ans.add(arr[l]);
                System.out.println();
                for(Map.Entry e : c.entrySet()) System.out.print(e.getKey() + " ");
            }
        }
        System.out.println();
        for(Integer a : ans) System.out.print(a + " ");
    }
}
