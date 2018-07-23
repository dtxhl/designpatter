package com.xhl.demo2;

public class Singleton {

    private final static Singleton instatnce;

    static {
        instatnce = new Singleton();
    }
    private Singleton(){}

    public Singleton getInstance(){
        return instatnce;
    }

}
