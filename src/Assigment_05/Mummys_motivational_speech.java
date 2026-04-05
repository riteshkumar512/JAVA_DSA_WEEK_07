package Assigment_05;

import java.util.Scanner;

public class Mummys_motivational_speech {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input
        int N= sc.nextInt();
        int[][] arr=new int[N][N];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println(checkLowertriangle(arr));


    }
    public static boolean checkLowertriangle(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[0].length ; j++) {
                if (arr[i][j]!=0){
                    return false;
                }
            }
        }
         return true;
    }
}
