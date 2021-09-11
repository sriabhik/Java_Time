package com.Java_T;

class Balance {

    // Print balanced and remove
// extra brackets from string
    public static void balancedString(String str)
    {
        int count = 0, i;
        int n = str.length();
        int count2 = 0;
        // Maintain a count for opening brackets
        // Traversing string
        for (i = 0; i < n; i++) {

            // check if opening bracket
            if (str.charAt(i) == '(' && (i != n-1)) {

                // print str.charAt(i) and increment count by 1
                System.out.print(str.charAt(i) );
                count++;
            }

            // check if closing bracket and count != 0
            else if (str.charAt(i) == ')' && count != 0) {
                System.out.print(str.charAt(i));

                // decrement count by 1
                count--;
            }

            // if str.charAt(i) not a closing brackets
            // print it
            //else if (str.charAt(i) != ')')
              //  System.out.print(str.charAt(i));
        }

        // balanced brackets if opening brackets
        // are more then closing brackets
        //if (count != 0)
            // print remaining closing brackets
          //  for (i = 0; i < count; i++)
            //    System.out.print(")");
    }

    // Driver Method
    public static void main(String args[])
    {
        String str = "(()))(()";
        balancedString(str);
    }
}