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
       int mid = 1+(end-start)/2;
       devideArr(arr,start,mid);
       devideArr(arr,mid+1,end);
       conquer(arr,start,mid,end);
    }

    private static void conquer(int[] arr, int start, int mid, int end) {
        int [] mergedArray = new int[end-start+1];
        int id1 = start;
        int id2= mid+1;
        int x=0;

        while (id1<=mid && id2<=end){
            if(arr[id1]<=arr[id2]){
                mergedArray[x++]=arr[id1++];
            }else{
                mergedArray[x++]=arr[id2++];
            }
        }
        while(id1<=mid){
            mergedArray[x++]=arr[id1++];
        }
        while(id2<=end){
            mergedArray[x++]=arr[id2++];
        }
        for(int i=0,j =start;i<mergedArray.length;i++,j++){
            arr[j]=mergedArray[i];
        }
    }

}