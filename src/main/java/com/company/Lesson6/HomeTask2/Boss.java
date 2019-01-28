package com.company.Lesson6.HomeTask2;

public class Boss implements Employee {

   private String nameBoss;
   private int time;

    @Override
    public void work() {
        if(time<18 && time>=9){
            System.out.println("I'm Boss, my name is "+nameBoss+". It's "+time+"! I need to check how my Engineers work");
        }else {
            System.out.println("I'm Boss, my name is "+nameBoss+". It's "+time+"! I want to count my money");
        }
    }



    public Boss(String nameBoss, int time) {
        this.nameBoss = nameBoss;
        this.time = time;
    }

    public String getNameBoss() {
        return nameBoss;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "nameBoss='" + nameBoss + '\'' +
                ", time=" + time +
                '}';
    }
}
