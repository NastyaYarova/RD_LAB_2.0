package com.company.Lesson6.HomeTack22;

public interface Ship {

    void sink();
    void sail();

    int getHealth();
    void decreaseHealth(int value);




//   default void sail(boolean weather){
//      if(weather==true) {
//          System.out.println("Today I can sail");
//      } else {
//          System.out.println("I can't sail =(");
//      }
//   }


}
