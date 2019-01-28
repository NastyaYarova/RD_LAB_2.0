package com.company.Lesson6.HomeTack22;

public abstract class RegularShip implements Ship {

    private int health;
    private boolean isAlive;

    @Override
    public int getHealth() {
        return health;
    }

    public RegularShip(int health) {
        this.health = health;
        this.isAlive = true;
    }

    @Override
    public void decreaseHealth(int value) {

        this.health = getHealth() - value;
        if (getHealth() <= 0) {
            this.sink();
        }
    }

    @Override
    public void sink() {
        this.isAlive = false;
    }

    @Override
    public void sail() {
        if (this.isAlive == true) {
            System.out.println("We are sail");
        } else {
            System.out.println("We are not sail");
        }
    }

}
