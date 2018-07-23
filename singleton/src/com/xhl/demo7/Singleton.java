package com.xhl.demo7;

public class Singleton {

    private Singleton(){}

    private static class SingletonInstance{
        private static final Singleton instatnce = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.instatnce;
    }

}
