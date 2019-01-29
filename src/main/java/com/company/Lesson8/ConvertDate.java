package com.company.Lesson8;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.Locale;

public class ConvertDate {

    public DateTime convertStringToDate(String dateString) {
        //String dateString = "2019-01-24";
        DateTime date = DateTime.parse(dateString, DateTimeFormat.forPattern("yyyy-MM-dd"));
        System.out.println(date);
        return date;
    }

    public String convertLongToString(long dateLong) {
        String dateString = new DateTime(dateLong).toString(DateTimeFormat.forPattern("yyyy-MM-dd"));
        System.out.println(dateString);
        return dateString;
    }

    public String convertLongToDayOfWeek(long dateLong) {
        String dateString = new DateTime(dateLong).toString("EEEE", Locale.ENGLISH);

        System.out.println(dateString);

        return dateString;
    }

}
/*
 - дана дата в формате "2019-01-24" (естественно возможна и другая дата). создать метод для конертации ее в формат (кастомный который можно ввести например в форматах ниже):
	- "dd-MM-yyyy";
	- "dd/MM/yyyy";
 - переконвертировать дату в формате long в формат String по шаблону (шаблон подается в метод);
 - метод возвращающий день недели (в текстовом формате например "Январь") из даты в формате long;
 */