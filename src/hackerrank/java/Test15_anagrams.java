package hackerrank.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Test15_anagrams {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        Map<String, Integer> mapA = new LinkedHashMap<>();
        Map<String, Integer> mapB = new LinkedHashMap<>();
        for (char c : a.toCharArray()) {
            String key = String.valueOf(c).toUpperCase();
            if (mapA.containsKey(key)) {
                mapA.put(key, mapA.get(key) + 1);
            } else {
                mapA.put(key, 1);
            }
        }
        for (char c : b.toCharArray()) {
            String key = String.valueOf(c).toUpperCase();
            if (mapB.containsKey(key)) {
                mapB.put(key, mapB.get(key) + 1);
            } else {
                mapB.put(key, 1);
            }
        }
        for (Map.Entry entry : mapA.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        for (Map.Entry entry : mapB.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        return mapA.equals(mapB);
    }
}
