package algorithm.bigo;

public class BigO {
    public static void main(String[] args) {
        System.out.println("Big O!");
        System.out.println("Constant O(1): " + Constant(10));
        System.out.println("Logarithm O(log n): " + Logarithm(10));
        System.out.println("Linear O(n) : " + Linear(10));
        System.out.println("Linearithmic O(n log n) : " + Linearithmic(10));
        System.out.println("Quadratic O(n^2) : " + Quadratic(10));
        System.out.println("Factorial O(n^3) : " + Cubic(10));
        System.out.println("Factorial O(n!) : " + Factorial(10));
    }

    private static int Constant(int total) {
        return 1;
    }

    private static int Logarithm(int total) {
        int count = 0;
        for (int i = 0; i < total; i++) {
            count++;
            total--;
        }
        return count;
    }


    private static int Linear(int total) {
        int count = 0;
        for (int i = 0; i < total; i++) {
            count++;
        }
        return count;
    }

    private static int Linearithmic(int total) {
        int count = 0;
        for (int i = 0; i < total; i++) {
            int total2 = total;
            for (int j = 0; j < total2; j++) {
                count++;
                total2--;
            }
        }
        return count;
    }

    private static int Quadratic(int total) {
        int count = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                count++;
            }
        }
        return count;
    }

    private static int Cubic(int total) {
        int count = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                for (int k = 0; k < total; k++) {
                    count++;
                }
            }
        }
        return count;
    }

    private static String Factorial(int total) {
        return "Slow";
    }

}
