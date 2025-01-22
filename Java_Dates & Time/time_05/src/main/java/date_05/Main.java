// Date Time Formatter
package date_05;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();          // This is Date
        System.out.println(dt);

        // DateTimeFormatter
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");         // This is format
        // System.out.println(df);
        String myDateTime1 = dt.format(df1);                                        //creating date string using date and formatter
        System.out.println(myDateTime1);


        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");         // This is format
        // System.out.println(df);
        String myDateTime2 = dt.format(df2);                                        //creating date string using date and formatter
        System.out.println(myDateTime2);


        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E a");         // This is format, "E" means "week day", "a" means either "am" or "pm"
        // System.out.println(df);
        String myDateTime3 = dt.format(df3);                                        //creating date string using date and formatter
        System.out.println(myDateTime3);


        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;         // This is format
        String myDateTime = dt.format(df);                                        //creating date string using date and formatter
        System.out.println(myDateTime);
    }
}