package hackerrank.java;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Test09_java_date_and_time {

    public static void main(String[] args) {
        System.out.println(findDay(8, 14, 2017));
    }

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        return dayOfWeek.toUpperCase();
    }
}
