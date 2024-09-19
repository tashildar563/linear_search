package org.dsa;

public class CountInversionOfAnArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n= arr.length;
        int res = countInversion(arr,0,n-1);
        System.out.println(res);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    private static int countInversion(int[] arr, int l, int r) {
        int res=0;
        if (l>=r){
            return res;
        }
        int mid = l+(r-l)/2;
        res+=countInversion(arr,l,mid);
        res+=countInversion(arr,mid+1,r);
        res+= countInversionAndMerge(arr,l,mid,r);
        return res;
    }

    private static int countInversionAndMerge(int[] arr, int l, int mid, int r) {
        int merged[] = new int[r-l+1];
        int x=0;
        int id1=l;
        int idx2=mid+1;
        int cnt =0;

       while(id1<mid+1 && idx2<=r){
           if(arr[id1]<=arr[idx2]){
               merged[x++]=arr[id1++];
           }else{
               merged[x++]=arr[idx2++];
                cnt+=mid-l+1;
           }
       }
       while(id1<=mid){
           merged[x++]=arr[id1++];
       }
       while(idx2<=r){
           merged[x++]=arr[idx2++];
       }
       for(int i=0,j=l;i<merged.length;i++,j++){
           arr[j]=merged[i];
       }
       return cnt;
    }
}
