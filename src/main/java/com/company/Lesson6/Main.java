package com.company.Lesson6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Bird();
        Plane to123 = new Plane();
        FlyingFish fish = new FlyingFish();

//        ArrayList<Flyable> flyers = new ArrayList<>();
//        flyers.add(sparrow);
//        flyers.add(to123);
//        flyers.add(fish);
//
//        for (Flyable i : flyers){
//            i.fly();
//            i.sleep();
//            System.out.println(" ");
//        }

        printSeason(Season.AUTUMN);

        System.out.println(SeasonMedium.NOVEMBER.toString());



        SeasonComplicated seasonComplicated = SeasonComplicated.APRIL;
        System.out.println(seasonComplicated.getDays());
        System.out.println(seasonComplicated.getNameRu());
        System.out.println(seasonComplicated.getNameUa());
        System.out.println(seasonComplicated.getSeason());
    }

    public static void printSeason(Season seasonVariable){
        switch (seasonVariable){

            case WINTER:
                System.out.println("The Winter is coming...");
                break;

            case SPRING:
                System.out.println("The SPRING is coming...");
                break;

            case SUMMER:
                System.out.println("The SUMMER is coming...");
                break;

            case AUTUMN:
                System.out.println("The AUTUMN is coming...");
                break;
        }
    }
}
