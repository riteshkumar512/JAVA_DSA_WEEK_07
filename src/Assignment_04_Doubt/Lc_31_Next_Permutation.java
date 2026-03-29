package Assignment_04_Doubt;

import java.util.Scanner;

public class Lc_31_Next_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        permutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void permutation(int[] arr){
        int n= arr.length;
        int p=-1;
        //find p
        for (int i = n-2; i >=0 ; i--) {
            if (arr[i]<arr[i+1]){
                p = i;
                break;
            }
        }
        if (p==-1){
            Reverse(arr,0,n-1);
            return;
        }
        //find q
        int q=0;
        for (int i = n-1; i > p ; i--) {
            if (arr[i]>arr[p]){
                q=i;
                break;
            }
        }
        //swap p and q
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        //reverse p+1 to n-1
        Reverse(arr,p+1,n-1);
    }
    public static void Reverse(int[] array,int i,int j  ) {
        while (i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
