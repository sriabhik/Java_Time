package com.Java_T;

import java.io.*;

import java.lang.*;
import java.util.Scanner;


public class GFG {
    static int perfectSquare(String s)

    {
        int n = s.length();
        int ans = -1;

        String num = "";

        for (int i = 1; i < (1 << n); i++) {

            String str = "";



            for (int j = 0; j < n; j++) {


                if (((i >> j) & 1) == 1) {

                    str += s.charAt(j);

                }

            }

            if (str.charAt(0) != '0') {

                int temp = 0;

                for (int j = 0; j <

                        str.length(); j++)

                    temp = temp * 10 +

                            (int)(str.charAt(j) - '0');



                int k = (int)Math.sqrt(temp);


                if (k * k == temp) {


                    if (ans < (int)str.length()) {

                        ans = (int)str.length();

                        num = str;

                    }

                }

            }

        }



        if (ans == -1)

            return ans;

        else {

            System.out.print(num + " ");

            return n - ans;

        }

    }
    public static void main(String args[])

    {

        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int a = perfectSquare(n);
        if (a == -1)
            System.out.println("perfect square not formed");

    }
}
