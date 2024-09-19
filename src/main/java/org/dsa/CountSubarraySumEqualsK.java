package org.dsa;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraySumEqualsK {
    public static void main(String[] args) {
        int a[]={12,4,53,53,53,53,2,42,42};
        int k=97;
        int count=getCountOfSubarray(a,k);
        System.out.println(count);
    }

    private static int getCountOfSubarray(int[] a, int k) {
        int presum=0;
        int n=a.length;
        int cnt=0;
        Map map = new HashMap();
        map.put(0,1);
        for(int i=0;i<n;i++){
            presum+=a[i];
            int remove = presum-k;
            cnt=cnt+(int)map.getOrDefault(remove,0);
            map.put(presum,(int)map.getOrDefault(presum,0)+1);

        }
        return cnt;
    }
}
