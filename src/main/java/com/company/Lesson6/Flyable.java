package com.company.Lesson6;

public interface Flyable {

    void fly();

    default void sleep(){
        System.out.println("sleeping");
    }

}
