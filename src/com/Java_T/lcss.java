package com.Java_T;

import java.util.Scanner;
class Solution_4 {
    public  int lcs(int n,int m,String s1,String s2,int count ){
        if(n == 0 || m == 0)
            return count;
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            count += 1;
            return (lcs(n-1,m-1,s1,s2,count));
        }
        else
            return Math.max(count,Math.max(lcs(n-1,m,s1,s2,0),lcs(n,m-1,s1,s2,0)));
    }
}
public class lcss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Solution_4 s = new Solution_4();

        System.out.println(s.lcs(s1.length(),s2.length(),s1,s2,0));
    }
}
