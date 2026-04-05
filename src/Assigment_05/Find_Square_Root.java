package Assigment_05;

import java.util.Scanner;

public class Find_Square_Root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println(squreRoot(a));
    }


    public static int squreRoot(int A){
        int lo=1;
        int hi=A;
        int ans=0;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if (Math.pow(mid,2)==A){
                return mid;
            } else if (Math.pow(mid,2)<A) {
                ans=mid;
                lo=mid+1;
            }
            else {
                hi=mid-1;
            }
        }

       return ans;
    }
}
