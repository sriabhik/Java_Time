package Virtusa_round_2;

import java.util.Scanner;

public class Perfect_Square {
    public static boolean is_square(int n){
        int val = 0;
        int i = 1;
        while(val <= n){
            int temp = i * i;
            val = temp;
            if(temp == n)
                return true;
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;

            for (int i = a; i <= b; i++) {
                if(is_square(i))count++;
            }
            System.out.println(count);
        }

    }
}
