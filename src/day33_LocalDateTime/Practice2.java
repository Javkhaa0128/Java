package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {
    public static void main(String[] args) {

            String[] students = {"Javkhlantugs", "Amartuvshin", "tuvshintugs", "Minj", "Gantulga"};
            LocalDate[] birthDays = {LocalDate.of(1992, 01, 28),
                    LocalDate.of(1993, 8, 16),
                    LocalDate.of(1991, 2, 4),
                    LocalDate.of(1970, 4, 4),
                    LocalDate.of(1961, 7, 25)};

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");

            for(int i = 0; i <= students.length-1; i++){
                System.out.println(students[i]+" : "+birthDays[i].format(dateFormat));
            }

        }
    }
