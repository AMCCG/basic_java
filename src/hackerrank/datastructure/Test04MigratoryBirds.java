package hackerrank.datastructure;

import java.util.*;
import java.util.stream.Collectors;

public class Test04MigratoryBirds {

    public static void main(String[] args) {
        System.out.println("Migratory Birds");
        System.out.println("Test case 1 Expected 2 and then result is " + migratoryBirds(Arrays.asList(1, 1, 2, 2, 2, 3, 3, 3)));
        System.out.println("Test case 2 Expected 1 and then result is " + migratoryBirds(Arrays.asList(1, 1, 2, 2, 3)));
        System.out.println("Test case 2 Expected 4 and then result is " + migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3)));
        System.out.println("Test case 2 Expected 3 and then result is " + migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> map = new TreeMap<>();
        for (Integer i : arr) {
            if (map.containsKey(i)) {
                map.put(i, (map.get(i) + 1));
            } else {
                map.put(i, 1);
            }
        }
        Map<Integer, Integer> occurrence = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (s1, s2) -> s1, LinkedHashMap::new));
        return occurrence.keySet().stream().mapToInt(i -> i).sum();
    }
}
