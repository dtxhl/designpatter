package com.xhl.demo3;

public class Singleton {

    private static Singleton instatnce;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instatnce == null){
            instatnce = new Singleton();
        }
        return instatnce;
    }

}
