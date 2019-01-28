package com.company.Lesson6;

import java.util.List;

public class FlyingFish implements Flyable{
    private String tail;
    private List<String> flippers;

    @Override
    public void fly() {
        System.out.println("The FlyingFish is flying");
    }
}
