package com.Java_T;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class meeting_{
    int start;
    int end;
    meeting_(int start,int end){
        this.start  = start;
        this.end = end;
    }
}
public class Minimum_Platform {
    public static void minPlatform(ArrayList<meeting_> meet,int n){
        int p = 1 ;int ans = 1;
        int l = 1 ;int h = 0;
        while(l < n && h < n){

            if(meet.get(l).start <= meet.get(h).end){
                p++;
                if(p > ans)
                    ans = p;
                l++;
            }
            else if(meet.get(l).start > meet.get(h).end){
                p--;
                h++;
                //temp_d = meet.get(h).end;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<Integer> f = new ArrayList<>();
        ArrayList<meeting_> meet = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i  = 0 ; i < n ;i++) {
            s.add(sc.nextInt());
            //f.add(sc.nextInt());
        }
        for(int i  = 0 ; i < n ;i++) {
         //   s.add(sc.nextInt());
            f.add(sc.nextInt());
        }
        Collections.sort(s);
        Collections.sort(f);
        for(int i = 0 ; i  < n ;i++){
            meet.add(new meeting_(s.get(i),f.get(i)));
        }
        minPlatform(meet,meet.size());
    }
}
