package Assigment_05;

import java.util.Scanner;

public class A_Boolean_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int [][]arr=new int[M][N];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static void makingOnes(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==1){
                    int row=i;
                    int col=j;
                    while (col<arr[0].length){
                        arr[row][col]=1;
                        col++;
                    }
                    while (row< arr.length){
                        arr[row][col]=1;
                        row++;
                    }
                }
            }
        }
    }
}
