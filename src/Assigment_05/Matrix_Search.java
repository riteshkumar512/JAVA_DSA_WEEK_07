package Assigment_05;


import java.util.Scanner;

public class Matrix_Search {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr=new int[m][n];
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int k = scn.nextInt();
        System.out.print(Search(arr, k));
    }
    public static int Search(int[][] arr,int target){
        if (arr.length==0 || arr[0].length==0){
            return -1;
        }
        int i=0 ,j=arr[0].length-1;
        while (i<arr.length && j>=0){
                if (arr[i][j]== target) {
                    return 1;
                } else if (arr[i][j]>target) {
                    j--;
                }
                else {
                   i++;
                }
        }
        return -1;
    }

}
