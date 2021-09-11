package com.Java_T;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();int b = sc.nextInt();
        int c = sc.nextInt();int d = sc.nextInt();


        int ans1 = Math.min(Math.abs(24-a)+c,Math.min(Math.abs(a-1)+Math.abs(24-b),Math.abs(a-c)));
        int ans2 = Math.min(Math.abs(60-b)+d,Math.min(Math.abs(b-1)+Math.abs(60-b),Math.abs(b-d)));

        System.out.println(ans1+ans2);
    }
}
