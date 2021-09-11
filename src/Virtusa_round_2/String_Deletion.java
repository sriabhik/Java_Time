package Virtusa_round_2;

import java.util.Scanner;

public class String_Deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- != 0){
            String str = sc.next();
            int count = 1;
            for(int i = 0 ; i < str.length()-1;i++){
                if(str.charAt(i) == str.charAt(i+1)){
                    count++;
                }
            }
            if(count == str.length()) System.out.println(count -1);
            else{
                count = 0;
                for(int i = 0 ; i < str.length()-1;i++){
                    if(str.charAt(i) == str.charAt(i+1)){

                        count++;
                    }
                }
                System.out.println(count);
            }
        }

    }
}
