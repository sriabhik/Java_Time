package com.Java_T;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
class Solution_
{

    static int lcs(int x, int y, String s1, String s2)
    {
        int[][] arr = new int[x+1][y+1];
        for(int i = 0 ; i <=x ;i++){
            for(int j = 0 ; j <= y ;j++){
                if(i == 0 || j == 0)
                    arr[i][j] = 0;
                else if(s1.charAt(i-1) == s2.charAt(j-1))
                    arr[i][j] = 1 + arr[i-1][j-1];
                else
                    arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
            }
        }
        return arr[x][y];
    }

}
public class lcs_dp {
    public static void main(String[] args) throws IOException {
        Scanner sc = new  Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Solution_ s = new Solution_();

        System.out.println(s.lcs(s1.length(),s2.length(),s1,s2));
    }
}
