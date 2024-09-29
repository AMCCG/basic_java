package hackerrank.java;

import java.util.Scanner;

public class Test16_Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String regx = "[ !,?._'@]+";
            String[] tokens = s.split(regx);
            System.out.println(tokens.length);
            for (String t : tokens) {
                System.out.println(t);
            }
        }
    }
}
