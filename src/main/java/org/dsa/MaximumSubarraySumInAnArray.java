package org.dsa;

public class MaximumSubarraySumInAnArray {
    public static void main(String[] args) {
        /*Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray.*/

        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int max=0;
//        for (int i=0;i<arr.length-1;i++){//O(n)
//            int sum = 0;
//            for(int j=i;j<arr.length-1;j++){//O(n)
//                sum+=arr[j];
//                max = Math.max(sum,max);
//            }
//
//        }
//        System.out.println(max);
        /*optimal solution*/
        int sum=0;
        int start=0;
        int ansStart=-1;
        int ansEnd=-1;
        for(int i=0;i<arr.length;i++){
            if(sum==0) start = i;
            sum+=arr[i];
            if(sum>max){
                ansStart=start;
                ansEnd=i;
                max=sum;
            }

            if(sum<0){
                sum=0;
            }
        }
        for(int i=ansStart;i<=ansEnd;i++){
            System.out.println(">>"+arr[i]);
        }
        System.out.println(max);

    }
}
