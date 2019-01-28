package com.company.Lesson6;

import java.util.List;

public class Plane implements Flyable{
    private String engine;
    private List<String> wings;

    @Override
    public void fly() {
        System.out.println("The Plane is flying");
    }

    @Override
    public void sleep() {
        System.out.println("The Plane is never sleep");
    }

}
