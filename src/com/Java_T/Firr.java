package com.Java_T;

import java.util.*;



public class Firr {



    public static boolean isNumBalanced(int n)

    {

        // Calling integer to char array convert function

        char[] num = num_to_arr(n);



        // HashMap is used to store key value pairs

        HashMap<Character, Integer> hp

                = new HashMap<Character, Integer>();



        // traverse char array and store array elements as

        // key and their frequency as their value

        for (int i = 0; i < num.length; i++)

        {



            // if element already exists in the HashMap, so

            // we increment its previous value

            if (hp.containsKey(num[i]))

            {

                hp.put(num[i], hp.get(num[i]) + 1);

            }



            // element does'nt exist in the HashMap, so we

            // initialize its value with 1

            else

            {

                hp.put(num[i], 1);

            }

        }



        // use Collection to store values of all the keys

        Collection c = (Collection)hp.values();



        // use iterator to iterate over each value

        Iterator<?> iterator = c.iterator();

        int temp = (Integer) iterator.next();



        while (iterator.hasNext())

        {

            // compare each value to be equal, if not return

            // false

            if ((int) iterator.next() != temp) {

                return false;

            }

        }



        // each value was equal so return true

        return true;

    }



    // This function converts integer into char array

    public static char[] num_to_arr(int num)

    {

        // Convert integer into String

        String str = Integer.toString(num);

        char[] arr = new char[str.length()];



        // Insert characters of the string into char array

        for (int i = 0; i < str.length(); i++) {

            arr[i] = str.charAt(i);

        }

        return arr;

    }



    // Driver code

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i =0;i < 5;i++)
            arr[i] = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < 5;i++){
            if(isNumBalanced(arr[i]))
                ans.add(arr[i]);
        }
        Collections.sort(ans);
        System.out.println(ans.get(0)+ans.get(ans.size()-1));

    }

}