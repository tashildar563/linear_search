package org.dsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTripletsThatAddUpToZero {
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        Set <List<Integer>>arrNew=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]+arr[j+1]==0){
                    List<Integer> innerSet = new ArrayList<>();
                    innerSet.add(arr[i]);
                    innerSet.add(arr[j]);
                    innerSet.add(arr[j+1]);
                    innerSet.sort(null);
                    arrNew.add(innerSet);
                }
//                for(int k=j+1;k<arr.length;k++){
//
//                    if(0==arr[i]+arr[j]+arr[k]){
//                        List<Integer> innerSet = new ArrayList<>();
//                        innerSet.add(arr[i]);
//                        innerSet.add(arr[j]);
//                        innerSet.add(arr[k]);
//                        innerSet.sort(null);
//                        arrNew.add(innerSet);
//                    }
//                }
            }
        }
        System.out.println(arrNew.toString());

    }
}
