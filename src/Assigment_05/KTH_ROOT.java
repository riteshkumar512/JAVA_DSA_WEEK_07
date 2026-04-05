package Assigment_05;

import java.util.Scanner;

public class KTH_ROOT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while (T-- >0) {
            long N = sc.nextLong();
            int K = sc.nextInt();

            System.out.println(Root(N, K));
        }
    }
    public static long Root(long n,int k){
        long lo=1;
        long hi=n;
        long ans=0;
        while (lo<=hi){
            long mid=(lo+hi)/2;
            if (Math.pow(mid,k)<= n){
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return ans;
    }
}
