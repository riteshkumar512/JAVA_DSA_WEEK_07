package Assignment_04_Doubt;

import java.util.Scanner;

public class Lc_1537_Get_the_Maximum_Score {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- >0){
            int n= sc.nextInt();
            int m= sc.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new  int[m];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i]=sc.nextInt();
            }
            for (int i = 0; i < arr2.length; i++) {
                arr2[i]= sc.nextInt();
            }
            System.out.println(Maximum_score(arr1,arr2));
        }

    }

    public static int Maximum_score(int[] arr1, int[] arr2) {
        int s1 = 0, s2 = 0, i = 0, j = 0;
        long sum = 0;
        int mod = 1000_000_007;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                //s1 to i
                long sum1=Sum_of_array(arr1,s1,i);
                //s2 to j
                long sum2=Sum_of_array(arr2,s2,j);
                sum+=Math.max(sum1,sum2);
                i++;
                j++;
                s1=i;
                s2=j;
            }
        }
        //s1 to i
        long sum1=Sum_of_array(arr1,s1, arr1.length-1);
        //s2 to j
        long sum2=Sum_of_array(arr2,s2, arr2.length-1);
        sum += Math.max(sum1,sum2);
        sum = sum % mod;
        return (int) (sum);
    }

    public static long Sum_of_array(int[] arr1,int si,int ei){
        long sum=0;
        for (int i=si;i<=ei;i++){
            sum= sum+arr1[i];
        }
        return sum;
    }
}
