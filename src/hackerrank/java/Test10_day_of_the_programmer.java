package hackerrank.java;

public class Test10_day_of_the_programmer {
    public static void main(String[] args) {
        System.out.println("Expected 12.09.2017 : " + dayOfProgrammer(1984));
        System.out.println("Expected 13.09.2017 : " + dayOfProgrammer(2017));
        System.out.println("Expected 12.09.2016 : " + dayOfProgrammer(2016));
        System.out.println("Expected 12.09.1800 : " + dayOfProgrammer(1800));
    }

    static boolean isLeap(int year) {
        if (year < 1918) {
            return year % 4 == 0;
        } else {
            return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        }

    }

    public static String dayOfProgrammer(int year) {
        if (year == 1918) {
            return "26.09.1918";
        }
        if (isLeap(year)) {
            return "12.09." + year;
        } else {
            return "13.09." + year;
        }
    }
}
