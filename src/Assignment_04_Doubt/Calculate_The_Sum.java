package Assignment_04_Doubt;

import java.util.Scanner;

public class Calculate_The_Sum {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int q= sc.nextInt();
        while (q-- > 0){
            int x=sc.nextInt();
            arr=Calculate(arr,x);
        }
        long sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        sum= sum% 1000_000_007;
        System.out.println(sum);

    }
public static int [] Calculate(int[] arr ,int x){
        int [] brr=new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        int j=i-x;
        if (j<0){
            j+= arr.length;
        }
        brr[i]=arr[i]+arr[j];
    }
    return brr;
}
}
