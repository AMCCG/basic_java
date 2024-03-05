package hackerrank.datastructure;

import java.util.Arrays;
import java.util.List;

public class Test03DivisibleSumPairs {
    public static void main(String[] args) {
        System.out.println("Divisible Sum Pairs");
        int result = divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2));
        System.out.println("Expected 5 and then result is " + result);
        int result2 = divisibleSumPairs(6, 5, Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Expected 3 and then result is " + result2);
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int result = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = 0; j < ar.size(); j++) {
                if (i == j || i > j) {
                    continue;
                }
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    result += 1;
                }
            }
        }
        return result;
    }

}
