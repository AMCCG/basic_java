package hackerrank.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test01ArrayDs {
    public static void main(String[] args) {
        List<Integer> input1 = Arrays.asList(1, 4, 3, 2);
        List<Integer> res = reverseArray(input1);
        System.out.println(input1);
        System.out.println(res);
    }

    public static List<Integer> reverseArray(List<Integer> parameter) {
        List<Integer> result = new ArrayList<>(parameter);
        Collections.reverse(result);
        return result;
    }

}
