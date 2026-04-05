package Assigment_05;

import java.util.Scanner;

public class Print_Upper_Triangular_Matrix {
    public static void main(String[] args) {
        //INput
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] arr=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        //Output
        for (int i = 0; i < arr.length; i++) {
            MakingZero(arr[i],i);
        }
        //Print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    //Method
    public static void MakingZero(int[] arr ,int i){
        while (i>0){
            arr[i-1]=0;
            i--;
        }
    }
}
