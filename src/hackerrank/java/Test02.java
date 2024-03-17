package hackerrank.java;

import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        System.out.println("Test 02");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
