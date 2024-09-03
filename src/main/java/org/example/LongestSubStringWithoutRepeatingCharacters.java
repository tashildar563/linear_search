package org.example;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "kljklasjfkkljsdkfj";
        int count = 0;
        count = getLongestSubString(s);
        System.out.println(count);
    }

    private static int getLongestSubString(String s) {
        int n = s.length();
        int left =0;
        Set<Character> charSet = new HashSet<>();
        int ml=0;
        for (int right=0;right<n;right++){
            char charAtright = s.charAt(right);
            if(!charSet.contains(charAtright)){
                charSet.add(charAtright);
                ml = Math.max(ml,right-left+1);
            }else{
                while(charSet.contains(charAtright)){
                    System.out.println(charAtright);
                    charSet.remove(charAtright);
                    left++;
                }
                charSet.add(charAtright);
            }
        }
        return ml;
    }

}
