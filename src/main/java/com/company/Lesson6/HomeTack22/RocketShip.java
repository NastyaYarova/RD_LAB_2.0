package com.company.Lesson6.HomeTack22;

public class RocketShip extends MilitaryShip {

    public RocketShip(int health) {
        super(health);
    }

    @Override
    int getFireValue() {
        return 10;
    }
}
