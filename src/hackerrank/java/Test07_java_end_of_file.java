package hackerrank.java;

import java.util.Scanner;

public class Test07_java_end_of_file {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (scanner.hasNext()) {
            System.out.println(i + " " + scanner.nextLine());
            i++;
        }
    }
}
