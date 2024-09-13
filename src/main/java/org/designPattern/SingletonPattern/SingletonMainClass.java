package org.designPattern.SingletonPattern;

public class SingletonMainClass {
    public static void main(String[] args) {
        SingletonPattern instance = SingletonPattern.getSingletonPatternInstance();
        instance.showMessage();
    }
}
