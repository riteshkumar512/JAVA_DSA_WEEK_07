package Assigment_05;

import java.util.Scanner;

public class Book_Allocation_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] pages = new int[n];
            for (int i = 0; i < pages.length; i++) {
                pages[i] = sc.nextInt();
            }
            System.out.println(minimumPages(pages, m));
        }
    }
    public static int minimumPages(int[] pages,int nos){
    int lo=0;
    int hi=0;
        for (int i = 0; i < pages.length; i++) {
            hi += pages[i];
        }
       int ans=0;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if (isItPossible(pages,nos,mid)){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isItPossible(int[] pages,int nos,int mid){
        int student=1;
        int readpage=0;
        for (int i = 0; i < pages.length; ) {
            if (readpage+pages[i]<= mid){
                readpage+=pages[i];
                i++;
            }else{
                readpage=0;
                student++;
            }
            if (student>nos){
                return false;
            }
        }
        return true;
    }
}
