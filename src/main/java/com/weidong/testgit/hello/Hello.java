package com.weidong.testgit.hello;

/**
 * Created by Wei Dong on 2014/3/30.
 */
public class Hello {

    public String hello(String who) {
        return "Hello " + who;
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.hello("World"));
    }
}
