package com.Java_T;
import java.util.*;

class Job{
    int j;
    int d;
    int p;
    Job(int j,int d,int p){
        this.j =j;this.d = d;this.p = p;
    }
}
class mycomparator_ implements Comparator<Job>{
    @Override
    public int compare(Job o1,Job o2){
        if(o1.p < o2.p)
            return 1;
        else if(o1.p > o2.p)
            return -1;
        return 0;
    }
}
public class Job_sequence_G {
    public static void Max_Profit(ArrayList<Job> t ,int n,int n2){
        mycomparator_ mc = new mycomparator_();
        Collections.sort(t,mc);
        int[] ans = new int[n2];
        Arrays.fill(ans,-1);
        int res = 0;

        for(int p = 0;p < n ; p++){
            int in = t.get(p).d-1;
            while(in >= 0 )
            {
                if(ans[in] == -1){
                   // System.out.print(t.get(p).p + " " );
                    ans[in] = t.get(p).p;
                    res += ans[in];
                    break;
                }
                in--;
            }

        }
        //System.out.println();

        System.out.println(res );
    }
    public static void main(String[] args) {
        ArrayList<Job> t = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] j = new int[n];int [] d = new int[n];int[] p = new int[n];
        for(int i = 0 ; i < n ; i++){
            j[i] = sc.nextInt();
            d[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        for(int i = 0  ; i < n ;i++){
            t.add(new Job(j[i],d[i],p[i]));
        }
        int val = Arrays.stream(d).max().getAsInt();
        Max_Profit(t,n,val);
    }
}
