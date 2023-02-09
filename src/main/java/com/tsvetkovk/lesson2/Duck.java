package com.tsvetkovk.lesson2;

public class Duck implements Flyable, Swimable{

    @Override
    public void fly() {
        System.out.println("Утра летит");
    }


    @Override
    public void swim() {
        System.out.println(2);
    }
}
