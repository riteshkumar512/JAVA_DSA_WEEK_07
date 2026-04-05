package Assigment_05;

import java.util.Scanner;

public class Arrays_Spiral_Print_Clockwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N= sc.nextInt();
        int[][] arr=new int[M][N];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        PrintSpiral(arr);
    }
    public static void PrintSpiral(int[][] arr){
        int minr=0,minc=0,maxr= arr.length-1,maxc=arr[0].length-1;
        int c=0;
        int te=arr.length*arr[0].length;
        while (c < te) {
            for (int i = minc ; i <= maxc && c < te ; i++) {
                System.out.print(arr[minr][i]+ "," + " ");
                c++;
            }
            minr++;
            for (int i = minr; i <= maxr && c < te; i++) {
                System.out.print(arr[i][maxc] + "," +" ");
                c++;
            }
            maxc--;
            for (int i = maxc; i >= minc && c < te ; i--) {
            System.out.print(arr[maxr][i] + "," +" ");
                c++;
            }
            maxr--;
            for (int i = maxr; i >= minr && c < te ; i--) {
            System.out.print(arr[i][minc] + "," +" ");
                c++;
            }
            minc++;
        }
        System.out.println("END");
    }
}
