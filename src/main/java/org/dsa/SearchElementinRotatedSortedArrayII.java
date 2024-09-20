package org.dsa;

public class SearchElementinRotatedSortedArrayII {
    /*Given an integer array arr of size N, sorted in ascending order (may contain duplicate values)
    and a target value k. Now the array is rotated at some pivot point unknown to you.
        Return True if k is present and otherwise, return False. */
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k=3;
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while(l<=r){
            int mid = (r+l)/2;
            if(arr[mid]==k);
        }

    }
}
