package com.company.Lesson6.HomeTask2;

public interface Employee {

    void work();

    default void goHome(int time){
       if((time>18 && time<23) || (time<9 && time>0 )){
           System.out.println("It's "+time+"! I`m happy, I dont`t need to work!");
       } else {
           System.out.println("It's "+time+"! Oh no, I need to work");
       }
    }
}
