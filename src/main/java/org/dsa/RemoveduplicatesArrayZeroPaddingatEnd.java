package org.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveduplicatesArrayZeroPaddingatEnd {
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().distinct().collect(Collectors.toList()));
        for(int i=0;i<arr.length;i++){
            if(i<list.size()){
                arr[i] = list.get(i);
            }else{
                arr[i]=0;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(">>"+arr[i]+"<<");
        }
    }
}
