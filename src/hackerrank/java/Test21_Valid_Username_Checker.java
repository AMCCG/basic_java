package hackerrank.java;

import java.util.Scanner;

public class Test21_Valid_Username_Checker {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

class UsernameValidator {

    public static String regularExpression = "^[a-zA-Z][\\w]{7,29}$";
}
