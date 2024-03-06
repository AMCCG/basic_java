package hackerrank.java;

public class Test01IfElse {
    public static void main(String[] args) {
        System.out.println("If Else");
        printIfElse(3);
        printIfElse(24);
    }

    private static void printIfElse(int n) {
        if (n % 2 == 1) {
            System.out.println("Weird");
        } else if (n % 2 == 0) {
            if ((n > 2 && n < 5) || n > 20) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        }
    }
}
