package com.company.Lesson6.HomeTack22;


// interface Корабль <- abstract class Военный Корабль <- class Авианосец.


public class Main {

    public static void main(String[] args) {

        RocketShip rocketShip1 = new RocketShip(100);
        RocketShip rocketShip2 = new RocketShip(30);

        rocketShip1.sail();
        rocketShip2.sail();

        rocketShip1.fight(rocketShip2);
        rocketShip1.fight(rocketShip2);
        rocketShip1.fight(rocketShip2);


        System.out.println(rocketShip2.getHealth());

        rocketShip2.sail();
        rocketShip1.sail();
    }
}
