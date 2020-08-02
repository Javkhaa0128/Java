package day34_WrapparClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
1. use the LocalDate & Time get the current date and time int the following format:
        Sunday, 09:51 AM, Jul/26/2020
 */
public class warmup {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime today = LocalDateTime.now();

        System.out.println(today);

        System.out.println( today.format(dtf)) ;













    }
}
