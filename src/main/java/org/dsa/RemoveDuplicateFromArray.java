package org.dsa;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1,2,2,3,3,4};
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[j];
                }
            }
        }
        int index=0;
        for(int element : set){
            arr[index++]=element;
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
