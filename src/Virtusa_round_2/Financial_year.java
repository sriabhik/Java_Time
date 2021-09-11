package Virtusa_round_2;

import java.util.*;
class mycomparator implements Comparator<Name>{
    @Override
    public int compare(Name n1,Name n2){
        return  n1.str.compareTo(n2.str);

        }
    }
class mycomparator_ implements Comparator<Name>{
    @Override
    public int compare(Name n1,Name n2){
        if(n1.sal > n2.sal)
            return 1;
        else if(n1.sal < n2.sal)
            return -1;
        return 0;

    }
}
class Name{
    String str;
    int sal;
    Name(String s,int v){
        str = s;
        sal = v;
    }
}
public class Financial_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Name> cnt = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String str = sc.next();
            int val = sc.nextInt();
            cnt.add(new Name(str,val));
        }

        mycomparator mc = new mycomparator();
        Collections.sort(cnt,mc);
        System.out.println("After sorting the employee name:");
        for(int i = 0;i < n;i++){
            System.out.println(cnt.get(i).str + "-" + cnt.get(i).sal  );
        }
        System.out.println("After sorting the salary:");
        mycomparator_ mc_ = new mycomparator_();
        Collections.sort(cnt,mc_);
        for(int i = 0;i < n;i++){
            System.out.println(cnt.get(i).str + "-" + cnt.get(i).sal  );
        }
    }
}
