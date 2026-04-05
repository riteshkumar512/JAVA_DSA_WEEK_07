package Assigment_05;

import java.util.Scanner;

public class Piyush_and_Magical_Park {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int K=sc.nextInt();
        int S=sc.nextInt();
        int[][] arr=new int[N][M];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.next().charAt(0);
            }
        }
        magic(arr,K,S);

    }
    public static void magic(int[][] arr,int K,int S){
        for (int i = 0; i < arr.length; i++) {

            if (S < K){
                break;
            }
            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == '.'){
                    S -=2;//Encounter
                    S--;//step

                } else if (arr[i][j] == '*') {
                    S+=5;//Encounter
                    S--;//step
                }
                else {//#
                    break;
                }
            if (j == arr[0].length-1){
                S++;
            }
            }
        }
        if (S >= K){
            System.out.println("Yes");
            System.out.println(S);
        }else {
            System.out.println("No");
        }

    }
}
