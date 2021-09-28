package Tcs_Code_2021;

import java.util.Scanner;

public class Anagram_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        if(str1.length() != str2.length())
            System.out.println("Not Anagram");
        else {

            int[] count = new int[128];
            int j  = 0;
            while(j < str1.length()){
                count[str1.charAt(j)]++;
                count[str2.charAt(j++)]--;
            }
            int k=0;
            for(int a : count){
                if(a != 0){
                k++;
                    System.out.println("Not Anagram");}
            }
            if(k == 0) System.out.println("Anagram");
        }
    }
}
