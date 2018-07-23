package com.xhl.demo5;

public class Singleton {

    private static Singleton instatnce;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if (instatnce == null){
            synchronized (Singleton.class){
                instatnce = new Singleton();
            }
        }
        return instatnce;
    }

}
