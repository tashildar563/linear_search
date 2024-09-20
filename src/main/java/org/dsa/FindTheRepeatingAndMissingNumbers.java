package org.dsa;

import java.util.*;

public class FindTheRepeatingAndMissingNumbers {
    public static void main(String[] args) {
        int arr[]={3,1,2,5,4,6,7,5};
        int xr=0;
        Set<Integer> l = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            xr=xr^arr[i];
            l.add(arr[i]);
        }
        for(Integer x : l){
            xr=xr^x;
        }
        System.out.println(xr);
        for(int i=0;i<arr.length;i++){
            int k=1+i;
            if(l.contains(k)){
                System.out.println("existing no.");
                System.out.println(k);
            }else{
                System.out.println("non existing no.");
                System.out.println(k);
            }
        }
    }
}
