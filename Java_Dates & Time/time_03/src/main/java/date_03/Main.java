package date_03;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Time: "+c.getTime());
        System.out.println("Date: "+c.get(Calendar.DATE));
        System.out.println("Second: "+c.get(Calendar.SECOND));
        System.out.println("Hour: "+c.get(Calendar.HOUR));
        System.out.println("Hour in 24hour format: "+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: "+c.get(Calendar.MINUTE));
        System.out.println("Month: "+c.get(Calendar.MONTH));
        System.out.println("Year: "+c.get(Calendar.YEAR));
        System.out.println("My_Time: "+c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        /* 
        GregorianCalendar is a concrete sub class of Abstract Clalendar
        */
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("2024 is leap year: "+gc.isLeapYear(2024));
        System.out.println("2023 is leap year: "+gc.isLeapYear(2023));




        // TimeZone_type  variable_name = Class_name.Static_Method_name() ------------------------>  It returns an instance of the TimeZone class according to Time Zone Id;
        TimeZone t = TimeZone.getTimeZone("GMT");
        // t.getAvailableIDs()
        System.out.println("Available IDs of Time Zone: "+t.getAvailableIDs());
        // t.getID()
        System.out.println("Time Zone ID: "+t.getID());
        // t.getDefault()
        System.out.println("Default Time Zone ID: "+t.getDefault());
    }
}