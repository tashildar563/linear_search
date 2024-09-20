package org.dsa;

public class SerachInRotatedArray {
    /*Given an integer array arr of size N, sorted in ascending order (with distinct values) and a target value k.
    Now the array is rotated at some pivot point unknown to you. Find the index at which k is present and if k is not present return -1.
     */
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2,3};
        int k=3;
        int n=arr.length;
        boolean flag=false;
        int l=0;
        int r=n-1;
        while (l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==k){
                flag=true;
                break;
            }
            if(arr[l]<=arr[mid]){
                if(arr[l]<=k && k<=arr[mid]){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if(arr[mid]<=k && k<=arr[mid]){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }

        }

        System.out.println(flag);

    }
}
