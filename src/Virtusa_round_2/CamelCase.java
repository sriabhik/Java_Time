package Virtusa_round_2;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 1;
        for(int i = 0 ; i < str.length();i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                count++;
            }
        }
        System.out.println(count);
    }
}

