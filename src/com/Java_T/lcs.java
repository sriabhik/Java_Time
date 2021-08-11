package com.Java_T;
import java.io.IOException;
import java.util.*;

class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static double Solve(int x,int y,String s1,String s2,double[][]arr){
        if(x == 0 || y == 0)
            arr[x][y] = 1;
        if(arr[x][y] != -1)
            return arr[x][y];
        if(s1.charAt(x-1) == s2.charAt(y-1))
            arr[x][y] = 1 + Solve(x-1,y-1,s1,s2,arr);
        else
            arr[x][y] = Math.max(Solve(x-1,y,s1,s2,arr),Solve(x,y-1,s1,s2,arr));
        return arr[x][y];
    }
    static double lcs(int x, int y, String s1, String s2)
    {

        double[][] arr = new double[x+1][y+1];

        for (double[] row: arr)
            Arrays.fill(row, -1.0);
        double ans = Solve(x,y,s1,s2,arr);
        return ans;
    }

}
public class lcs {
    public static void main(String[] args) throws IOException {
        Scanner sc = new  Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Solution s = new Solution();
        System.out.println(s.lcs(s1.length()-1,s2.length()-1,s1,s2));
    }
}