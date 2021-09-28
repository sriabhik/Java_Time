package Tcs_Code_2021;

import java.util.Scanner;

public class Magic_key {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int[] arr = new int[n];
        for(int i =0;i < n ; i++){
            char c = str.charAt(i);
            arr[i] = Character.getNumericValue(c);
        }
        int flag = 0;
        int i = 0;
        while(flag == 0 && i < n- 1){
            if(arr[i] + arr[i+1] == 10){
                i += 2;
            }
            else{
                flag = 1;
            }
        }
        if(flag == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
