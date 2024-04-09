package hackerrank.java;

import java.util.Scanner;

public class Test08_java_static_initializer_block {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            int area = b * h;
            System.out.println(area);
        }
    }
}
