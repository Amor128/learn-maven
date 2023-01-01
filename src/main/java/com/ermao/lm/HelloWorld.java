package com.ermao.lm;


public class HelloWorld {
    public String getHello() {
        return "Hello, world";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().getHello());
    }
}
