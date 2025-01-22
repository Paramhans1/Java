/* 
Time Types:
- Local Date: store year, month and day
              example:
              LocalDate birthday = LocalDate.of(2020, Month.FEBURARY, 2); ------> 2020-02-02
- Local Time: store hour, minutes, second and nanosecond
              example:
              LocalTime time = LocalTime.of(7, 30); --------------> 07:30
- Local Date Time: combination of Local Date and Local Time
              example:
              LocalDateTime currentDateTime = LocalDateTime.now()
              LocalDateTime date = LocalDateTime.of(2020, Month.MAY, 2, 11, 13, 10, 12, 265); ---------> 2020-05-11 T 13:10:12.000000265
- Calenders: 
- Time Zones: Offset ------------------------------------------------> 14:02:50 + 1:00
              OffsetDateTime ----------------------------------------> 2020-05-23T14:02:50 + 1:00
              ZonedDateTime -----------------------------------------> 2020-05-23T14:02:50 + 1:00 Europe/Paris
- Formatter: return date in a predefined format
             example:DateTimeFormatter date = DateTimeFormatter.ofPattern("MM-dd-yyyy");
             date.format(localDateTime);
             Year ---------------------------------------------------> 2020
             YearMonth ------------------------------------------------> 2020-05
             MonthDay -------------------------------------------------> 05-23 
Coversion, Difference and Modification
- Conversion: convert one date to another
- Difference: find the difference between two dates
- Modification: modify the date
  example: isAfter(), isBefore() --------------> returns boolean depending upon weather the given time is before or after the object time 
           plusDays(), minusDays() ------------> we can add or subtract days, month, years, week , sec ...... etc
           with() -----------------------------> it is used to modify only one parameter either hour, min, date....etc
           from() -----------------------------> convert one type into another one
           ChronoUnit ------->  DAYS.between(), YEARS.between() ------------> it is a ENUM which returns difference between years or hours or centures ....etc
*/


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
package example_052;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println("Year:"+System.currentTimeMillis()/1000/3600/24/365);
    }
}