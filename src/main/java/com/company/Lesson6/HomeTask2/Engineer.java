package com.company.Lesson6.HomeTask2;

public class Engineer implements Employee {


private String nameEngineer;
    private int time;

    public Engineer(String nameEngineer, int time) {
        this.nameEngineer = nameEngineer;
        this.time = time;
    }

    @Override
    public void work() {
        if(time<18 && time>=9){
            System.out.println("I'm Engineer, my name is "+nameEngineer+". It's "+time+"! Oh, no, I need to work(");
        }else {
            System.out.println("I'm Engineer, my name is "+nameEngineer+". It's "+time+"! I want to sleep");
        }
    }

    public String getNameEngineer() {
        return nameEngineer;
    }

    public void setNameEngineer(String nameEngineer) {
        this.nameEngineer = nameEngineer;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "nameEngineer='" + nameEngineer + '\'' +
                ", time=" + time +
                '}';
    }
}
