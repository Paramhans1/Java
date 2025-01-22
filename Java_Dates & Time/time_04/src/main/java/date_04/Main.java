// java.time : is a package. capable of storing even nano seconds
package date_04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Create a LocalDate object to represent the current date
        LocalDate d = LocalDate.now();
        System.out.println(d);

        // Create a LocalTime object to represent the current time
        LocalTime t = LocalTime.now();
        System.out.println(t);

        // Create a LocalDateTime object to represent the current date and current Time
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}