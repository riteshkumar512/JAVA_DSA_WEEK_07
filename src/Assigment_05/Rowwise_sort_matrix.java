package Assigment_05;

import java.util.Scanner;

public class Rowwise_sort_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] arr=new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        //Sorting
        for (int i = 0; i < arr.length; i++) {
            Sort(arr[i]);
        }
        //Print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
    //Sorting Method
    public static void Sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            InsertlastElement(arr, i );
        }

    }
    public static void InsertlastElement(int[] arr,int i){
        int item=arr[i];
        int j= i-1;
        while (j>=0 && arr[j]>item){
            arr[j+1]=arr[j];
            arr[j]=item;
            j--;
        }
    }
}
