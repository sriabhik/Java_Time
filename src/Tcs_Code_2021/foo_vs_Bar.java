package Tcs_Code_2021;

import java.util.Scanner;

public class foo_vs_Bar {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  n = 3;
        foo_vs_Bar s = new foo_vs_Bar();
       // System.out.println(s.foo(n));
        System.out.println(s.bar(n));

    }
    /*int foo(int n ){
        int x = 0;
        System.out.println(n);
        while(n > 0)
            x = x + foo(n--);
        return n;
    }*/
    int bar(int n){
        System.out.print(n + " ");
        int x  = 0;
        while(n > 0)
            x += bar(n-1);
        return n;
    }
}
