package Assigment_05;

import java.util.Scanner;

public class Column_with_maximum_sum_in_a_Matrix {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        MaximumSum(arr);

    }
    public static void MaximumSum(int[][] arr){
        int maxSum=Integer.MIN_VALUE;
        int colInx=-1;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[0].length; j++) {
                sum +=arr[j][i];
            }
            if (sum > maxSum){
                maxSum=sum;
                colInx=i+1;
            }
        }
        System.out.println(colInx + " " + maxSum);
    }
}
