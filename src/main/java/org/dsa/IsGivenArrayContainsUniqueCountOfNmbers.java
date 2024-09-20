package org.dsa;

import java.util.*;

public class IsGivenArrayContainsUniqueCountOfNmbers {
    /*Array of integer = {1,2,2,1,1,3}  coutn 0f 1 is 3  >>  coutn 0f 2 is 2 >>  coutn 0f 3 is 1 */
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 2, 1, 1,3,3);
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : a) {
            Integer v = map.getOrDefault(i, 0);
            if (v == 0) {
                map.put(i, 1);
            } else {
                v = v + map.get(i);
                map.put(i, v);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        boolean flag= true;
        for (Map.Entry<Integer, Integer> kv : map.entrySet()) {
            boolean f = set.add(kv.getValue());
            if (!f) {
                flag=false;
                break;
            }
        }
        System.out.println(String.valueOf(flag));
    }
}
