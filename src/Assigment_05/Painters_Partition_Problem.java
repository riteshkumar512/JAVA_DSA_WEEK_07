package Assigment_05;

import java.util.Scanner;

public class Painters_Partition_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();//no. of painters
        int n=sc.nextInt();//no. of boards
        int[] length=new int[n];
        for (int i = 0; i < length.length; i++) {
            length[i]=sc.nextInt();
        }
        System.out.println(minimumTime(length,k));

    }
    public static int minimumTime(int[] length,int nop){
        int lo=0;
        int hi=0;
        for (int i = 0; i < length.length; i++) {
            hi+=length[i];
        }
        int ans=0;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if (isItPossible(length,nop,mid)){
                ans=mid;
                hi=mid-1;
            }else {
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isItPossible(int[] length,int nop,int mid){
        int painter=1;
        int boardPainted=0;
        for (int i = 0; i < length.length; ) {
            if (boardPainted+length[i] <= mid){
                boardPainted+=length[i];
                i++;
            }else {
                boardPainted=0;
                painter++;
            }
            if (painter>nop){
                return false;
            }
        }
        return true;
    }
}
