package org.example;

public class TrapRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    private static int trap(int[] height) {
        /*
        * let i =0 and LM=first element
        * let j=array size -1 and RM = last element in array
        * let sum =0
        *
        * while i is less than j till then
        * if LM<=RM then sum = sum+(LM-i the element of array)
        * and i++ , LM = maximum between LM and i the element of array
        * else
        * the sum = sum +(RM-j the element of array)
        * and j--; RM= will be maximum between RM and j the element of array
        *
        * now the sum we get will be the unit of water trapped in between in towers
        * */

            int i=0;
            int left_max = height[0];
            int sum=0;
            int j=height.length-1;
            int right_max=height[j];
            while(i<j){
                if (left_max<=right_max) {
                    sum+=(left_max-height[i]);
                    i++;
                    left_max=Math.max(left_max,height[i]);
                } else {
                    sum+=(right_max-height[j]);
                    j--;
                    right_max=Math.max(right_max,height[j]);
                }
            }
            return sum;

    }
}
