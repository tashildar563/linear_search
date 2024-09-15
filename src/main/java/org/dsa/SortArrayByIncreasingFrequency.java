package org.dsa;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int nums []= new int[]{-1,1,-6,4,5,-6,1,4,1};
        for(int i:frequencySort(nums)){
            System.out.println(">>"+i+"<<");
        }
    }
    public static int[] frequencySort(int[] nums) {
//        int n = nums.length;
//        Map<Integer,Integer> nf = new HashMap<>();
//        for(int i=0;i<n;i++){
//            int v = nf.getOrDefault(nums[i],0);
//            if(v==0){
//                nf.put(nums[i],1);
//            }else{
//                nf.put(nums[i],v+=1);
//            }
//        }
//        List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(nf.entrySet());
//        Collections.sort(list,(i1, i2)->i1.getValue().compareTo(i2.getValue()));
//        int l[] = new int[n];
//        int count = 0;
//        for(Map.Entry<Integer,Integer> map : list){
//            Integer v = map.getValue();
//            Integer k = map.getKey();
//            while(v>0){
//                l[count]=k;
//                v--;
//                count++;
//            }
//        }
//
//        return l;
        int[] count = new int[201];
        for (int num : nums) {
            count[num + 100]++;
        }
        Integer[] numsArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsArr, (a, b) -> {
            if (count[a + 100] == count[b + 100]) {
                return b - a;
            }
            return count[a + 100] - count[b + 100];
        });
        return Arrays.stream(numsArr).mapToInt(Integer::intValue).toArray();

    }
}
