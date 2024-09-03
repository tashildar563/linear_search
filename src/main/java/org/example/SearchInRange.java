package org.example;

import java.net.SocketOption;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {18,12,-7,3,14,28};
        int start = 1;
        int end = 4;
        int target = -7;
        boolean found = searchInRange(arr,start,end,target);
        System.out.print(found);

    }

    private static boolean searchInRange(int[] arr, int start, int end, int target) {
        if (arr.length==0){
            return false;}

        for (int i =start; i ==end ; i++){
            if (target == arr[i]){
                return true;
            }
        }
        return false;
    }
}
