package Virtusa_round_2;

import java.util.Scanner;
import java.util.Stack;

public class Nested_Quotation {
    static  int max(int a,int b){
        return a>b?a:b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum =0;
        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        if(sum % 2 != 0)
            System.out.println("no quotation");
        else{
            Stack<Integer> s = new Stack<>();
            int ans = arr[0];
            for(int i = 0; i < n ;i++){
                if(i+1< n) {
                    if(!s.empty() && s.peek() == arr[i])
                        s.pop();
                    else {
                        s.push(arr[i]);
                        ans = max(arr[i], ans);
                    }
                }
                else{
                        int temp = s.pop();
                        if(s.peek() == arr[i]-temp){
                            System.out.println(ans) ;
                            break;
                        }

                }

            }
        }

    }
}
