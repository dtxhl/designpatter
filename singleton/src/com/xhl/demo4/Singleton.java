package com.xhl.demo4;

public class Singleton {

    private static Singleton instatnce;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if (instatnce == null){
            instatnce = new Singleton();
        }
        return instatnce;
    }

}
