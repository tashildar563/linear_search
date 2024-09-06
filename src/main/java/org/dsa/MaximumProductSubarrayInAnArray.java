package org.dsa;

public class MaximumProductSubarrayInAnArray {
    public static void main(String[] args) {
        /*Given an array that contains both negative and positive integers, find the maximum product subarray.*/
        int[] arr = new int[]{1,2,-3,0,-4,-5};
        int maxProdct=Integer.MIN_VALUE;
//        for(int i =0; i<arr.length;i++){
//            int product = 1;
//            for(int j=i;j<arr.length;j++){
//                product = product*arr[j];
//                maxProdct=Math.max(product,maxProdct);
//            }
//        }
        int pre=1;
        int suf=1;
        for(int i=0;i<arr.length;i++){
            if(pre==0)pre=1;
            if(suf==0)suf=1;
            pre*=arr[i];
            suf*=arr[arr.length-i-1];
            maxProdct=Math.max(maxProdct,Math.max(pre,suf));
        }
        System.out.println(maxProdct);
    }
}
