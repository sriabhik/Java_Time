package Virtusa_round_2;

import java.util.Scanner;

public class Power_Game {
    public static int is_pow(int n){
        int val = 0;
        int i  = 0 ;
        int lower =0;
        while(val <= n){
            if(i != 0)
                lower = (int)Math.pow(2,i-1);
            int temp = (int)Math.pow(2,i++);
            val = temp;
            if(temp == n)
                return temp;



        }
        return lower;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            int c = 0;int h = 0;
            int k  = 0 ;
            while(n != 1) {
                int flag = is_pow(n);

                if(k % 2 == 0){
                    c = 1;
                    h = 0;
                    if ((n-flag) == 0)
                        n = n / 2;
                    else
                        n = n - flag;
                    k++;
                }
                else{
                    c = 0;h = 1;
                    if ((flag - n) == 0)
                        n = n / 2;
                    else
                        n = n - flag;
                    k++;
                }
            }
            if(c == 1)
                System.out.println("Heron");
            else System.out.println("Claire");
        }

    }
}
