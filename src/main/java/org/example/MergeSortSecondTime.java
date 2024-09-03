package org.example;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class MergeSortSecondTime {
    public static void main(String[] args) {
        int arr[] = {32,423,4,535,3645,646,4565};

        int n = arr.length;

        devideArr(arr,0,n-1);
    }

    private static void devideArr(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int mid = start+(end-start)/2;

        devideArr(arr,start,mid);
        devideArr(arr,mid+1,end);

        conquer(arr,start,mid,end);
    }

    private static void conquer(int[] arr, int start, int mid, int end) {
        int merged[] = new int[end-start+1];

        int firstInd = start;
        int secondInd =mid+1;
        int x=0;

        while(firstInd<=mid && secondInd <=end){
           if(arr[firstInd]<=arr[secondInd]){
               merged[x++]=arr[firstInd++];
           }else{
               merged[x++]=arr[secondInd++];
           }
        }

        while (firstInd<=mid){
            merged[x++]=arr[firstInd++];
        }

        while(secondInd<=end){
            merged[x++]=arr[secondInd++];
        }
        for(int i=0,j=start;i< merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }

}
