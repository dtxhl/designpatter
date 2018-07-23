package com.xhl.demo6;

public class Singleton {

    private static volatile Singleton instatnce;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instatnce == null){
            synchronized (Singleton.class){
                if (instatnce == null){
                    instatnce = new Singleton();
                }
            }
        }
        return instatnce;
    }

}
