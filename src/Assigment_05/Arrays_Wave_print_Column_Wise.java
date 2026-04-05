package Assigment_05;

import java.util.Scanner;

public class Arrays_Wave_print_Column_Wise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int M=sc.nextInt();
        int[][]arr=new int[N][M];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        Display(arr);

    }
    public static void Display(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j]+"," + " ");
                }
            }
            else {
                for (int i = arr.length-1 ; i >=0 ; i--) {
                    System.out.print(arr[i][j]+","+" ");
                }
            }
        }
        System.out.println("End");
    }
}
