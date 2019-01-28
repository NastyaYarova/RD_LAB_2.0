package com.company.Lesson6;

import java.util.List;

public class Bird implements Flyable{
    private List<String> wings;
    private String tail;

    @Override
    public void fly() {
        System.out.println("The Bird is flying");
    }



}
