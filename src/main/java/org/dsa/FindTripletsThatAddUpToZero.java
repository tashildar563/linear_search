package org.dsa;

import java.util.*;

public class FindTripletsThatAddUpToZero {
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        List<List<Integer>> ans = new ArrayList<>();
//        Set <List<Integer>>arrNew=new HashSet<>();
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length-1;j++){
//                if(arr[i]+arr[j]+arr[j+1]==0){
//                    List<Integer> innerSet = new ArrayList<>();
//                    innerSet.add(arr[i]);
//                    innerSet.add(arr[j]);
//                    innerSet.add(arr[j+1]);
//                    innerSet.sort(null);
//                    arrNew.add(innerSet);
//                }
////                for(int k=j+1;k<arr.length;k++){
////
////                    if(0==arr[i]+arr[j]+arr[k]){
////                        List<Integer> innerSet = new ArrayList<>();
////                        innerSet.add(arr[i]);
////                        innerSet.add(arr[j]);
////                        innerSet.add(arr[k]);
////                        innerSet.sort(null);
////                        arrNew.add(innerSet);
////                    }
////                }
//            }
        arr=mergeSort(arr);
        int n= arr.length;
        for(int i=0;i<arr.length;i++){
            if(i!=0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer> temp =  Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k-1])k--;
                }
            }
        }
        for(List<Integer> list : ans){
            System.out.println(list.toString());
        }

    }

    private static int[] mergeSort(int[] arr) {
        int n= arr.length;
        devide(arr,0,n-1);
        return arr;
    }

    private static void devide(int[] arr, int l, int r) {
        if(l>=r){
            return;
        }
        int mid = l+(r-l)/2;
        devide(arr,l,mid);
        devide(arr,mid+1,r);
        conqour(arr,l,mid,r);
    }

    private static void conqour(int[] arr, int l, int mid, int r) {
        int merged[]=new int[r-l+1];
        int x=0;
        int id1=l;
        int id2=mid+1;
        while(id1<=mid && id2<=r){
            if(arr[id1]<=arr[id2]){
                merged[x++]=arr[id1++];
            }else{
                merged[x++]=arr[id2++];
            }
        }
        while(id1<=mid){
            merged[x++]=arr[id1++];
        }
        while(id2<=r){
            merged[x++]=arr[id2++];
        }
        for(int i=0,j=l;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
}
