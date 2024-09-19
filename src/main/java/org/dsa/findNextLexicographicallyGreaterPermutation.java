package org.dsa;

public class findNextLexicographicallyGreaterPermutation {
    /*next_permutation : find next lexicographically greater permutation


370

6
Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).*/

    public static void main(String[] args) {
            int [] arr = {3,2,1};
            nextPrmutation(arr,arr.length);
            for(int i=0;i<arr.length-1;i++){
                System.out.println(i);
            }
    }

    private static void nextPrmutation(int[] arr, int n) {
        int ind1=-1;
        int ind2=-1;
        //find break point
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind1=i;
                break;
            }
        }
        //if there are no break point;
        if(ind1==-1){
            reverseArr(arr,0);
        }else{
            for(int i=n-1;i>=0;i--){
                if(arr[i]>arr[ind1]){
                    ind2=i;
                    break;
                }
            }
        }
        swapArr(arr,ind1,ind2);
        reverseArr(arr,ind1+1);
    }

    private static void reverseArr(int[] arr, int i) {
        int n= arr.length;
        int j=n-1;
        while(i<j){
            swapArr(arr,i,j);
            i++;
            j--;
        }
    }

    private static void swapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
