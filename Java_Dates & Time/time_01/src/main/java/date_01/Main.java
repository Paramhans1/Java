/* 
java.time ------------------------> is a package used to deal with date and time in java. from java 8
                                    before java 8 . "java.util" package was used to hold date and time classes now these classes are deprecated. so we can still find this in old projects
                                    Dates or time in java are stored in format of long number
                                    long number holds number of milli-seconds passed since 1 jan 1970
                                    1 jan 1970 is known as epoch
                                    java assumes that 1900 is the start year which whenever we ask how many year passed it calculate from 1900
                                    so if we want to get the year of 2020 then it will return 120
                                    so we need to add 1900 to get the actual year
*/
package date_01;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // System.currentTimeMillis() ----------------------> returns milli-seconds since 1 jan 1970
        System.out.println(System.currentTimeMillis());
        System.out.println("Year:"+System.currentTimeMillis()/1000/3600/24/365);


        // Is it same to store millisecond in a variable of long type
        System.out.println(Long.MAX_VALUE);

        Date d = new Date();                                // returns current date and time
        System.out.println(d);

        // Java Date & Time:
        System.out.println("Time in milliseconds: "+d.getTime());
        // below are the me""+thods which are depricated my java . but still we can find in old projects
        System.out.println("Year - 1900: "+d.getYear());
        System.out.println("Date: "+d.getDate());
        System.out.println("Day: "+d.getDay());
        System.out.println("Hours: "+d.getHours());
        System.out.println("Minutes: "+d.getMinutes());
        System.out.println("Seconds: "+d.getSeconds());
        System.out.println("125 + 1900:"+(d.getYear()+1900));
        System.out.println("125 + 1900:"+d.getYear()+1900);     // here it will consider whole thing as a string . make sure to use parantersis
    }
}