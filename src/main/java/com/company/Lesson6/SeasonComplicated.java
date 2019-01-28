package com.company.Lesson6;

public enum SeasonComplicated {

    JANUARY(SeasonMedium.JANUARY, "Январь", 31, Season.WINTER),
    FEBRUARY(SeasonMedium.FEBRUARY, "Февраль", 28, Season.WINTER),
    MARCH(SeasonMedium.MARCH, "Март", 28, Season.SPRING),
    APRIL(SeasonMedium.APRIL, "Апрель", 28, Season.SPRING),
    MAY(SeasonMedium.APRIL, "Май", 28, Season.SPRING),
    JUNE(SeasonMedium.JUNE, "Июнь", 28, Season.SUMMER),
    JULY(SeasonMedium.JULY, "Июль", 28, Season.SUMMER),
    AUGUST(SeasonMedium.AUGUST, "Август", 28, Season.SUMMER),
    SEPTEMBER(SeasonMedium.SEPTEMBER, "Сентябрь", 28, Season.AUTUMN),
    OCTOBER(SeasonMedium.OCTOBER, "Октябрь", 28, Season.AUTUMN),
    NOVEMBER(SeasonMedium.NOVEMBER, "Ноябрь", 28, Season.AUTUMN),
    DESEMBER(SeasonMedium.DESEMBER, "Декабрь", 31, Season.WINTER);

    private final SeasonMedium nameUa;
    private final String nameRu;
    private final int days;
    private final Season season;

    SeasonComplicated(SeasonMedium nameUa, String nameRu, int days, Season season) {
        this.nameUa = nameUa;
        this.nameRu = nameRu;
        this.days = days;
        this.season = season;
    }

    public SeasonMedium getNameUa() {
        return nameUa;
    }

    public String getNameRu() {
        return nameRu;
    }

    public int getDays() {
        return days;
    }

    public Season getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return
                 nameRu +
                days +
                 season ;
    }

    private enum Season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN;
    }
}
