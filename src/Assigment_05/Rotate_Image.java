package Assigment_05;


import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Image {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

        Transpose(arr);
        Rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
    public static void Transpose(int[][] arr){
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = i; j < arr[0].length ; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void Rotate(int[][] arr){
        for (int col = 0; col < arr[0].length; col++) {
          int top=0;
          int bottom= arr.length-1;
          while (top < bottom){
              int temp =arr[top][col];
              arr[top][col]=arr[bottom][col];
              arr[bottom][col]=temp;
              top++;
              bottom--;
          }
        }
    }

}
