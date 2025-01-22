/* Calender class is an abstract class: hence we can not create instance of this class
                                        but it contain a static method which provide instance of the class
*/

package date_02;

import java.util.Calendar;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        // Calendar_type  variable_name = Class_name.Static_Method_name() ------------------------>  It returns an instance of the Calendar class initialized with the current date and time, using the default time zone and locale.
        Calendar c = Calendar.getInstance();
        // TimeZone_type  variable_name = Class_name.Static_Method_name() ------------------------>  It returns an instance of the TimeZone class according to Time Zone Id;
        TimeZone t = TimeZone.getTimeZone("Asia/Singapore");
        Calendar d = Calendar.getInstance(t);


        System.out.println();
        System.out.println(c);
        System.out.println();


        // c.getCalendarType() ------------------------------------------->  returns type of calender instance
        System.out.println("Calender type: "+c.getCalendarType());


        // c.getTimeZone() ------------------------------------------------> returns my local time Zone
        System.out.println("Time Zone: "+c.getTimeZone());

        // c.getTimeZone().getID ------------------------------------------------> returns Id of my my local time Zone
        System.out.println("ID of my time zone of c: "+c.getTimeZone().getID());
        System.out.println("ID of my time zone of d: "+d.getTimeZone().getID());


        System.out.println(c.getTime());   // Get current time with month , day, year
        int year = c.get(Calendar.YEAR); // Gets the current year
        int month = c.get(Calendar.MONTH); // Gets the current month (0-based)
        int day = c.get(Calendar.DAY_OF_MONTH); // Gets the current day of the month
        System.out.println("Today's date: " + day + "/" + (month + 1) + "/" + year);
        


    }
}