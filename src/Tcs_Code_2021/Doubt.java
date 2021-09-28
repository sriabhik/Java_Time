package Tcs_Code_2021;

import java.util.Scanner;

public class Doubt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] arr = new int[a];
        for (int i = 0; i < a; i++)
            arr[i] = sc.nextInt();
        int count =0;
        int [] ans = new int[a];
        int i ;
        int k = 0;
        for(i = 0 ; i < a;i++){
            if(arr[i] != 0)
                ans[k++] = arr[i];
            else
                count++;
        }
        for(int j = k ;j < a;j++)
            ans[j] = 0;
        for(int ap : ans)
            System.out.print(ap + " ");

    }
}
