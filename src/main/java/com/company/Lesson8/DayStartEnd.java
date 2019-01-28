package com.company.Lesson8;

import org.joda.time.DateTime;

public class DayStartEnd {


    private static final DateTime dayNow = new DateTime();

    public static long convertDateToLong() {
        return dayNow.getMillis();
    }

    public static long startOfDay() {
        return dayNow.withTimeAtStartOfDay().getMillis();
    }

    public static long endOfDay() {
        return dayNow.withTimeAtStartOfDay().plusSeconds(86399).getMillis();
    }
}
// - получить дату в формате long на начало дня;
//- получить дату в формате long на конец дня;