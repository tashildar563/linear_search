package org.dsa;

public class MaxPointsObtainedFromCards {
    public static void main(String[] args) {
        int[] cardPoints = {1, 2, 3, 9, 5, 6, 1};
        int k = 3;
        System.out.println(maxPoints(cardPoints, k));
    }

    private static int maxPoints(int[] arr, int k) {
//        int leftMax = 0;
//        int rightMax=0;
//        int maxSum=0;
//        int n=cardPoints.length;
//        for(int i = 0;i<k;i++){
//            leftMax+=cardPoints[i];
//        }
//        int rightIndex=n-1;
//        for(int i =k-1;i>=0;i--){
//            leftMax-=cardPoints[i];
//            rightMax+=cardPoints[rightIndex];
//            rightIndex--;
//            maxSum=Math.max(leftMax,rightMax);
//        }
//        return maxSum;
        int ans=0;
        int sum=0;
        int n=arr.length;
        for(int i=n-k;i<=n+k-1;i++){
            if(i<n){
                sum+=arr[i%n];
            }else{
                ans=Math.max(ans,sum);
                sum-=arr[(i-k)%n];
                sum+=arr[i%n];
            }
        }
        ans=Math.max(ans,sum);
        return ans;
    }

}
