package hackerrank.datastructure;

import java.util.Arrays;
import java.util.List;

public class Test02SubArrayDivision {
    public static void main(String[] args) {
        List<Integer> input1 = Arrays.asList(1, 2, 1, 3, 2);
        int res = birthday(input1, 3, 2);
        System.out.println(input1);
        System.out.println("Expected: 2 and then result is " + res);

        List<Integer> input2 = Arrays.asList(1, 1, 1, 1, 1);
        int res2 = birthday(input2, 3, 2);
        System.out.println(input2);
        System.out.println("Expected: 0 and then result is " + res2);

        List<Integer> input3 = Arrays.asList(4);
        int res3 = birthday(input3, 4, 1);
        System.out.println(input3);
        System.out.println("Expected: 1 and then result is " + res3);
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        for (int i = 0; i < s.size(); i++) {
            int lastIdx = i + m;
            if (lastIdx > s.size()) {
                break;
            }
            List<Integer> dived = s.subList(i, lastIdx);
            int summing = 0;
            for (Integer integer : dived) {
                summing += integer;
            }
            if (summing == d) {
                result += 1;
            }
        }
        return result;
    }


}
