package Assigment_05;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();//no of stalls
        int c= sc.nextInt();//no of cows
        int[] stall =new int[n];
        for (int i = 0; i < stall.length; i++) {
            stall[i]= sc.nextInt();
        }
        Arrays.sort(stall);
        System.out.println(LargestMinimumDistance(stall,c));
    }
    public static int LargestMinimumDistance(int[] stall,int c){
        int lo=0;
        int hi=stall[stall.length-1]-stall[0];
        int ans=0;
        while (lo <= hi){
            int  mid=(lo+hi)/2;
            if(isItPossible(stall,c,mid)){
                ans=mid;
                lo=mid+1;
            }
            else {
                hi=mid-1;
            }
        }
        return ans;
    }
    public static boolean isItPossible(int[] stall,int noc, int miniDis){
        int cow=1;
        int pos=stall[0];
        for (int i = 0; i < stall.length; i++) {
            if((stall[i]-pos)>= miniDis){
                cow++;
                pos=stall[i];
            }
            if (cow == noc){
                return true;
            }
        }
        return false;
    }

}
