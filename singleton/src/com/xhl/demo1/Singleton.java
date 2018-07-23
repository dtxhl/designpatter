package com.xhl.demo1;

/**
 * https://www.cnblogs.com/zhaoyan001/p/6365064.html
 */
public class Singleton {

    private final static Singleton instatnce = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instatnce;
    }

}
