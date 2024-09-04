package org.example;

public class MergeSort {
    public static void conquer(int arr[], int si ,int mid, int ei){
//creating new array
        int merged [] = new int[ei-si+1];
        //starting index
        int idx1 = si;
        // mid +1 index
        int idx2 = mid+1;
        int x=0;

        // run loop till the start index is less than or equal to mid index and index 2 is less than or equal to end index.
        while(idx1<=mid && idx2<=ei){
            //now if value at index one is greater that or equal to value at index 2 then add the value at index one +1 to merged array.
            if(arr[idx1]<=arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                //else add value at index two in merged array.
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++] = arr[idx2++];
        }
        for (int i =0 , j=si; i< merged.length;i++,j++){
            arr[j] = merged[i];
        }

    }
    public static void devide(int arr[], int si, int ei){

        //if starting index is more than ending index or equal return.
        if(si>=ei){
            return;
        }
        // find mid
        // staring index + (ending index - staring index)/ 2
        int mid = si + (ei-si)/2;
        //deviding the arr from staring index to mid index;
        devide(arr,si,mid);
        //deviding the arr from mid+1 index to end index;
        devide(arr,mid+1,ei);
         // now sort the devided array
        conquer(arr,si,mid,ei);
    }
    public static void main (String[] args){
        int arr[]={0,0,0,0,2,1,2,1,2,1,2,3,};
        int n = arr.length;

        devide(arr,0,n-1);
        for(int i =0; i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
