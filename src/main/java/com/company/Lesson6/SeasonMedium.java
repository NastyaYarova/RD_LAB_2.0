package com.company.Lesson6;

public enum SeasonMedium {

    JANUARY("Січень"),
    FEBRUARY("Лютий"),
    MARCH("Березень"),
    APRIL("Квітень"),
    MAY("Травень"),
    JUNE("Червень"),
    JULY("Липень"),
    AUGUST("Серпень"),
    SEPTEMBER("Вересень"),
    OCTOBER("Жовтень"),
    NOVEMBER("Листопад"),
    DESEMBER("Грудень");

   private final String nameUa;

    SeasonMedium(String nameUa) {
        this.nameUa = nameUa;
    }

    @Override
    public String toString() {
        return  nameUa;
    }


}
