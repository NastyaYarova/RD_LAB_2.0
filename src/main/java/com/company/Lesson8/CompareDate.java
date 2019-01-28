package com.company.Lesson8;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import java.util.Date;

public class CompareDate {

    public boolean compareDate() {

        DateMidnight date1 = new DateMidnight(2012, 12, 7);
        DateMidnight date2 = new DateMidnight(2012, 12, 7);
        System.out.println(date1.isEqual(date2));

        return date1.isEqual(date2);
    }

    public boolean compareDateWithYourDates(Date date1, Date date2) {
        return date1.equals(date2);
    }

    public boolean isSameDate(DateTime date1, DateTime date2) {
        return date1.withTimeAtStartOfDay().isEqual(date2.withTimeAtStartOfDay());
    }

}
//- метод, который сравнивает две даты;