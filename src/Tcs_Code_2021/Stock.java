package Tcs_Code_2021;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Item_n = new int[n];
        String[] Item_Name = new String[n];
        Float[] Price  = new Float[n];
        int[] Stock = new int[n];
        for(int i = 0; i < n;i++){
            Item_n[i] = sc.nextInt();
            Item_Name[i] = sc.next();
            Price[i] = sc.nextFloat();
            Stock[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        while (t-- != 0){
            int Item_number = sc.nextInt();
            int Stock_ = sc.nextInt();
            for(int i =0 ; i < n ; i++){
                if(Item_n[i] == Item_number){
                    if(Stock[i] >= Stock_){
                        System.out.println(Price[i]*Stock_+" INR");
                        Stock[i] -= Stock_;
                        System.out.println(Stock[i]+" LEFT");
                    }
                    else if(Stock[i] < Stock_){
                        System.out.println("NO STOCK");
                        System.out.println(Stock[i]+" LEFT");
                    }

                }
                else{
                    System.out.println("INVALID INPUT");
                }
            }
        }
    }
}
