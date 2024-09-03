package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] nums = {32, 43, 53, 5, 345, 1, 423, 423, 543, 564, -1};
        int target = 2;
        int ans = linearsearc(nums, target);
        System.out.println("===========================================================");
        System.out.println(ans);
        System.out.println("===========================================================");

    }

    static int linearsearc(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}