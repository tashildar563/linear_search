package org.example;

public class IsPalindrome {

    public static void main(String[] args) {
        int p= 123455321;
        boolean  r = isPalindrome(p);
        System.out.println("result >> "+ r);
    }

    private static boolean isPalindrome(int p) {
        if(p<0 || p!=0 && p%10==0){
            return false;
        }
        int reversed =0;
        while (p>reversed){
            System.out.println("++++++++++++++++++++++++");
            System.out.println("reversed >> " +reversed);
            reversed = reversed*10 + p%10;
            System.out.println("reversed >> " +reversed);
            p/=10;
            System.out.println("p/=10 >> "+ p );
            System.out.println("------------------------------------");
        }
        return (p==reversed || p==reversed/10);
    }
}
