package org.dsa;

import java.util.HashMap;
import java.util.Map;

public class CountRheNumberofSubarrayswithGivenXorK {
    public static void main(String[] args) {
        int a[]={4, 2, 2, 6, 4};
        int k=6;
        int xr=0;
        int cnt=0;
        Map map = new HashMap();
        map.put(xr,1);
        int n= a.length;
        for(int i=0;i<n;i++){
            xr=xr^a[i];
            int x=xr^k;
            if(map.containsKey(x)){
                cnt+=(int)map.getOrDefault(x,0);
            }
            if(map.containsKey(xr)){
                map.put(xr,(int)map.get(xr)+    1);
            }else{
                map.put(xr,1);
            }

        }
        System.out.println(cnt);
    }
}
