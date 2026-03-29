package Assignment_04_Doubt;

import java.util.Scanner;

public class Lc_918_Maximum_Sum_Circular_Subarray {
     public static void main(String[] args) {
//         int[] nums={1,-2,3,-2};
//         int result =Circular_Subarray(nums);
//         System.out.println(result);
         Scanner sc=new Scanner(System.in);
         int t= sc.nextInt();
         while (t-- >0){
             int n= sc.nextInt();
             int[] arr=new int[n];
             for (int i = 0; i < arr.length; i++) {
                 arr[i]= sc.nextInt();
             }
             System.out.println(Circular_Subarray(arr));
         }
    }

    public static int Circular_Subarray(int[] nums){
        int linear_sum=Kadense_Algo(nums);
        int total_sum=0;
        for (int i = 0; i < nums.length; i++) {
            total_sum+= nums[i];
            nums[i] = -1*nums[i];
        }
        int middle_sum=Kadense_Algo(nums);
        int Circular_sum=total_sum + middle_sum;
        if (Circular_sum==0){
            return linear_sum;
        }
       return  Math.max(linear_sum,Circular_sum) ;
    }

    //Kadense Algorithm
    public static int Kadense_Algo(int[] arr){
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans=Math.max(ans,sum);
            if (sum<0){
                sum=0;
            }
        }
        return ans;
    }
}
