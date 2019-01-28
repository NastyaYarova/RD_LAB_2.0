package com.company.Lesson8;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        //System.out.println(DayStartEnd.convertDateToLong());

        // №1
        System.out.println("№1");
        ConvertDate convertDate = new ConvertDate();
        convertDate.convertStringToDate("2019-01-24");

        // №2
        System.out.println("№2");
        System.out.println(DayStartEnd.startOfDay());

        // №3
        System.out.println("№3");
        System.out.println(DayStartEnd.endOfDay());

        // №4
        System.out.println("№4");
        //ConvertDate convertLongToString = new ConvertDate();
        convertDate.convertLongToString(DayStartEnd.convertDateToLong());

        // №5
        System.out.println("№5");
        CompareDate compareDate = new CompareDate();
        compareDate.compareDate();

        CompareDate compareDate1 = new CompareDate();
        DateTime dateTime1 = new DateTime(2018, 12, 12, 0, 0);
        DateTime dateTime2 = new DateTime(2019, 12, 12, 0, 0);
        boolean compareDates = compareDate1.isSameDate(dateTime1, dateTime2);
        System.out.println("Is (" + dateTime1 + ") equals to (" + dateTime2 + ")? = " + compareDates);

        // №6
        System.out.println("№6");
        convertDate.convertLongToDayOfWeek(1548712799000L);


    }


}
/*
 1- дана дата в формате "2019-01-24" (естественно возможна и другая дата). создать метод для конертации ее в формат (кастомный который можно ввести например в форматах ниже):
	- "dd-MM-yyyy";
	- "dd/MM/yyyy";
 2- получить дату в формате long на начало дня;
 3- получить дату в формате long на конец дня;
 4- переконвертировать дату в формате long в формат String по шаблону (шаблон подается в метод);
 5- метод, который сравнивает две даты;
 6- метод возвращающий день недели (в текстовом формате например "Январь") из даты в формате long;
*/