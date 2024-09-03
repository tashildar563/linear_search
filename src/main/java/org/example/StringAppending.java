package org.example;

import java.util.*;

public class StringAppending {
    public static void  output(String f, String s){
        int n= f.length();
        if (f.isEmpty()){
            n=s.length();
        }
        StringBuilder str  = new StringBuilder();
        for (int i =0 ; i<=n-1;i++){
            if(!f.isEmpty()){
                str.append(f.charAt(i));
            }
            if(i <=s.length()-1){
                str.append(s.charAt(i));
            }
        }
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list.retainAll(list1);
        System.out.println(list);
        System.out.println(str);
    }
    public static void main(String [] args){
        String frstString = "abhcgh";
        String secodString = "";
        output(frstString,secodString);
    }
}
