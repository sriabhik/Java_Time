package com.Java_T;

import java.util.Scanner;

public class Ringa_Ringa_Rose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int m = sc.nextInt();
        int round = 0;
        int child = 0;
        while(n != 1){
            int k = 0;
            while(k < m){
                k++;
            }
            child = round;
            n--;
            round++;

        }
        System.out.println(round + " " + (child+1));
    }
}
