package com.company.Lesson6.HomeTack22;

import java.util.ArrayList;

public abstract class MilitaryShip extends RegularShip{

    public MilitaryShip(int health) {
        super(health);
    }

    abstract int getFireValue();

   public void fight( Ship enemy){
     enemy.decreaseHealth(getFireValue());

   }


}
