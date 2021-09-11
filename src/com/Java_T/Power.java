package com.Java_T;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] f = {0,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32,768};
        int n = sc.nextInt();
        int ans = 0;int flag = 0;int ans2 =0;
        for(int i = 0; i < f.length;i++){
            if(n == f[i]){
                ans = n;
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            for(int i = 0; i < f.length;i++){
                if(n > f[i]){

                }
                else{
                    ans2 = f[i];
                    break;
                }

            }
        }
        int rev = 0;
        if(flag == 1){
            while(n != 0){
                rev += n % 10;
                n = n / 10;
            }
        }
        if(flag == 1){
            System.out.println("YES");
            System.out.println(rev);
        }
        else{
            System.out.println("NO");
            System.out.println(ans2);
        }

    }
}
