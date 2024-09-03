package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TowSum {

    public static void main(String[] args) {
        /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
            You may assume that each input would have exactly one solution, and you may not use the same element twice.
            You can return the answer in any order.
            Example 1:
            Input: nums = [2,7,11,15], target = 9
            Output: [0,1]
            Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
            Example 2:

            Input: nums = [3,2,4], target = 6
            Output: [1,2]
            Example 3:

            Input: nums = [3,3], target = 6
            Output: [0,1]
         */

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int [] result = getResult(nums,target);
        for (int i =0 ;i<result.length;i++){
            System.out.println("index >> "+ i);
        }
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("d");
        list2.retainAll(list);

        System.out.println(list2);


    }

    private static int[] getResult(int[] nums, int target) {
        Map<Integer,Integer> numMaps = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            numMaps.put(nums[i],i);
        }

        for (int i =0 ;i<nums.length;i++){
            Integer complement = target-nums[i];
            if(numMaps.containsKey(complement)&& numMaps.get(complement)!=i){
                return new int[]{i,numMaps.get(complement)};
            }
        }
        return new int []{};
    }
}
