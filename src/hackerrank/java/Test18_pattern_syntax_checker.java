package hackerrank.java;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Test18_pattern_syntax_checker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern result = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException p) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
