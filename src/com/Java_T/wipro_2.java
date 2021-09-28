package com.Java_T;

import java.util.Scanner;

public class wipro_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i < str.length()-1;i++){
            if((str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' || str.charAt(i)=='I' ||
                    str.charAt(i)=='o' ||str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U'  )){
                if((str.charAt(i+1)!='a' || str.charAt(i+1)!='A' || str.charAt(i)!='e' || str.charAt(i+1)!='E' || str.charAt(i+1)!='i' || str.charAt(i+1)!='I' ||
                        str.charAt(i+1)!='o' ||str.charAt(i+1)!='O' || str.charAt(i+1)!='u' || str.charAt(i+1)!='U'  )){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
