package com.company.Lesson6.HomeTask2;

public class Main {

    public static void main(String[] args) {

        Engineer tom = new Engineer("Tom", 23);
        Boss ivan = new Boss("Ivan",15);

       tom.work();
       ivan.work();

       tom.goHome(7);
       ivan.goHome(12);


    }
}
