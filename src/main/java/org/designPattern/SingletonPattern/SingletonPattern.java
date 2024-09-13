package org.designPattern.SingletonPattern;

public class SingletonPattern {
    private static SingletonPattern singletonPatternInstance;
    //private constructor to prevent instantiation
    private SingletonPattern(){

    }
    //public method to get instance
    public static SingletonPattern getSingletonPatternInstance()
    {
        if(singletonPatternInstance==null){
            singletonPatternInstance=new SingletonPattern();
        }
        return singletonPatternInstance;
    }
    public void showMessage(){
        System.out.println("Hellow from singleton");
    }
}
