package org.example;

public class SearchString {
    public static void main(String[] args){
        String name = "Rakes";
        char target = 'u';
        System.out.println(search(name,target));
        System.out.println(searchTwo(name,'a'));

    }

    private static boolean search(String name, char target) {
        if (name.isEmpty()){
            return false;
        }
        for (int i =0;i<name.length();i++){
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean searchTwo (String name, char target){
        if(name.isEmpty()){
            return false;
        }
        for (char  c : name.toCharArray()){
            if (c == target){
                return true;
            }
        }
        return false;
    }
}
