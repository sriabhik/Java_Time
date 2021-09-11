package Virtusa_round_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Unique_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer,Integer> cnt = new HashMap<>();
        for(int i =0 ; i < n ;i++){
            int val = sc.nextInt();
            arr[i] = val ;
            if(cnt.containsKey(val))
                cnt.put(val,cnt.get(val)+1);
            else
                cnt.put(val,1);
        }
        int ans = 0;
        for(Map.Entry e : cnt.entrySet()){
            int temp = (int)e.getValue();
            if(temp == 1) {
                ans = (int) e.getKey();
                break;
            }
        }
        System.out.println(ans);
    }
}
