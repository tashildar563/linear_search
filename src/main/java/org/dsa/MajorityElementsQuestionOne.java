package org.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementsQuestionOne {
    /*Majority Elements(&gt;N/3 times) | Find the elements that appears more than N/3 times in the array*/
    public static void main(String [] args){
        int [] arr=new int[]{1,2,4,2,3,2,6};
        int n=arr.length;
//        String ver ="";
//        for(int i=0;i<n;i++){
//            int count = 0;
//            for(int j=i;j<n-1;j++){
//                if(arr[i]==arr[j+1]){
//                    count++;
//                }
//            }
//            int dev = n/3;
//            if(dev<=count){
//                ver=String.valueOf(arr[i])+",";
//            }
//        }
        Map<String,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int v = map.getOrDefault(arr[i],0);
            map.put(String.valueOf(arr[i]),v+=1);
            if(null!=map.get(String.valueOf(arr[i]))){
                int c = map.get(String.valueOf(arr[i]));
            }else{
                map.put(String.valueOf(arr[i]),1);
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()>n/3){
                list.add(Integer.parseInt(entry.getKey()));
            }
        }
        System.out.println(list.toString());
    }
}
