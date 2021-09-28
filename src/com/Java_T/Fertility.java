package com.Java_T;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fertility {
    static int nCr(int n, int r)

    {

        return fact(n) / (fact(r) *

                fact(n - r));

    }



// Returns factorial of n

    static int fact(int n)

    {

        int res = 1;

        for (int i = 2; i <= n; i++)

            res = res * i;

        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int f = sc.nextInt();
        int ans1 = nCr(n,p);
        int ans2 = nCr(m,f);
        System.out.println(ans1 + ans2 - 1);

    }
}
