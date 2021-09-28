package com.Java_T;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int [] arr = new int[3];
        arr[0] = n1;
        arr[1] = n2;
        arr[2] = n3;
        int min_tho = Integer.MAX_VALUE;
        int max_hun = Integer.MIN_VALUE;
        int min_ten = Integer.MAX_VALUE;
        int max_un = Integer.MIN_VALUE;
        for(int i =0 ; i < 3;i++){
            int temp = arr[i];
            int p  = 0;
            while(temp != 0){
                p = temp % 10;
                temp = temp/10;
            }
            min_tho = Math.min(min_tho,p);
        }
        for(int i =0 ; i < 3;i++){
            int temp = arr[i];
            int count = 0;
            int p  = 0;
            while(count != 3){
                p = temp % 10;
                temp = temp/10;
                ++count;
            }
            max_hun = Math.max(max_hun,p);
        }
        for(int i =0 ; i < 3;i++){
            int temp = arr[i];
            int count = 0;
            int p  = 0;
            while(count != 2){
                p = temp % 10;
                temp = temp/10;
                ++count;
            }
            min_ten= Math.min(min_ten,p);
        }
        for(int i =0 ; i < 3;i++){
            int temp = arr[i];
            int count = 0;
            int p  = 0;
            while(count != 1){
                p = temp % 10;
                temp = temp/10;
                ++count;
            }
            max_un= Math.max(max_un,p);
        }
        System.out.println(min_tho+""+max_hun+""+min_ten+""+max_un);
    }
}
