package com.Java_T;

import java.util.Scanner;

class Lavanya{
    static  int res[][] = new int[10000][10000];

    static void multiply(int mat[][], int res[][],int N)
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = 0;
                for (int k = 0; k < N; k++)
                    res[i][j] += mat[i][k] * mat[k][j];
            }
        }
    }
    static boolean InvolutoryMatrix(int mat[][],int N)
    {

        multiply(mat, res,N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j && res[i][j] != 1)
                    return false;

                if (i != j && res[i][j] != 0)

                    return false;

            }

        }

        return true;

    }





    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]mat = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0 ; j < n;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        if (InvolutoryMatrix(mat,n)){
            System.out.println ( "True");
            for(int i = 0;i < n;i++){
                for(int j = 0 ; j < n;j++){
                    System.out.print(res[i][j] + " ");;
                }
                System.out.println();
            }
        }


        else{
            System.out.println ( "False");
            for(int i = 0;i < n;i++){
                for(int j = 0 ; j < n;j++){
                    System.out.print(res[i][j] + " ");;
                }
                System.out.println();
            }
        }







    }
}