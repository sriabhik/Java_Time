package com.Java_T;

import java.util.ArrayList;
import java.util.Scanner;

public class Susmitha {
    public static boolean is_Arms(int a){
        int ans = 0;
        int val = a;
        while(val != 0){
            int temp = val % 10;
            ans += temp * temp *temp;
            val = val /10;
        }
        if(ans == a)
            return true;
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = a ; i <= b ;i++){
            if(is_Arms(i))
                ans.add(i);
        }
        int res = ans.get(0) + ans.get(ans.size()-1);
        System.out.println(res);
    }
}
