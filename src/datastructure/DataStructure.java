package datastructure;

import java.util.*;

public class DataStructure {

    public static void main(String[] args) {
        System.out.println("DataStructure!");
        array();
        List();
        LinkedList();
        HashSet();
        LinkedHashSet();
        TreeSet();
        PriorityQueue();
        Map();

        String s = "eeaaaabbbbcccdddddfffffzzzzzzz";
        Map<Character, Integer> mapC = new TreeMap<>();
        for (char c : s.toCharArray()) {
            if (mapC.containsKey(c)) {
                int value = mapC.get(c);
                mapC.put(c, ++value);
            } else {
                mapC.put(c, 1);
            }
        }
        System.out.println(s);
        Map<Character, Integer> mapCSorted = mapC.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), LinkedHashMap::putAll);
        System.out.println("Map: " + mapC);
        System.out.println("Map sorted: " + mapCSorted);

        Map<Character, Integer> result = new TreeMap();
        boolean isFound = false;
        for (Map.Entry<Character, Integer> entry : mapCSorted.entrySet()) {
            for (Map.Entry<Character, Integer> entry2 : result.entrySet()) {
                if (entry.getValue() < entry2.getValue()) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                result.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }
        System.out.println("Result: " + result);
    }

    private static void array() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array");
        System.out.println("String[] arr = new String[size]");
        System.out.println("size: " + arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("Basic Operations in Arrays");
        System.out.println("Traverse: print all the array elements one by one.");
        System.out.println("Insertion: Adds an element at the given index.");
        System.out.println("Deletion: Deletes an element at the given index.");
        System.out.println("Search: Searches an element using the given index or by the value.");
        System.out.println("Update: Updates an element at the given index.");
        System.out.println("Display: Displays the contents of the array.");
    }

    private static void List() {
        System.out.println("List");
        List<String> list = Arrays.asList("JAVA", "C++", "PYTHON", "C#", "PYTHON");
        System.out.println("get: " + list.get(1));
        System.out.println("indexOf: " + list.indexOf("PYTHON"));
        System.out.println("lastIndexOf: " + list.lastIndexOf("PYTHON"));
        System.out.println("contains: " + list.contains("PYTHON"));
        System.out.println("containsAll: " + list.containsAll(Arrays.asList("JAVA", "C++", "PYTHON")));
        System.out.println("containsAll: " + list.containsAll(Arrays.asList("JAVA", "C++", "PYTHON", "1", "2")));
        Boolean retainAll = list.retainAll(Arrays.asList("JAVA", "C++", "PYTHON", "C#"));
        System.out.println("retainAll: " + retainAll);
        list.set(4, "GO");
        Collections.sort(list);
        for (String l : list) {
            System.out.println("list: " + l);
        }
        List<String> sublist = list.subList(1, 3);
        for (String l : sublist) {
            System.out.println("sublist: " + l);
        }
    }

    private static void LinkedList() {
        System.out.println("LinkedList");
        List<String> al = new ArrayList<String>();//creating arraylist
        al.add("Ravi");//adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        List<String> al2 = new LinkedList<String>();//creating linkedlist
        al2.add("James"); //adding object in linkedlist
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");
        System.out.println("arraylist: " + al);
        System.out.println("linkedlist: " + al2);
        for (String l : al2) {
            System.out.println("list: " + l);
        }
    }

    private static void HashSet() {
        System.out.println("HashSet");
        HashSet hashSet = new HashSet();
        hashSet.add("Java");
        hashSet.add("C#");
        hashSet.add("Dart");
        hashSet.add("Python");
        hashSet.add("Dart");
        System.out.println("HashSet: " + hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(1);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(2);
        hashSet2.add(7);
        hashSet2.add(2);
        hashSet2.add(9);
        hashSet2.add(8);
        hashSet2.add(7);
        hashSet.addAll(Arrays.asList(1, 2, 4, 5));
        System.out.println("hashSet2: " + hashSet2);
        HashSet<String> hashSet3 = new HashSet<String>();
        hashSet3.add("Java");
        hashSet3.add("3");
        hashSet3.add("Python");
        hashSet3.add("Ant");
        hashSet3.add("Python");
        hashSet3.add("Dart");
        hashSet3.add("C#");
        hashSet3.add("A");
        System.out.println("hashSet3: " + hashSet3);
    }

    private static void LinkedHashSet() {
        System.out.println("LinkedHashSet");
        LinkedHashSet hashSet = new LinkedHashSet();
        hashSet.add("Java");
        hashSet.add("C#");
        hashSet.add("Dart");
        hashSet.add("Python");
        hashSet.add("Dart");
        System.out.println("LinkedHashSet: " + hashSet);
    }

    private static void TreeSet() {
        System.out.println("treeSet");
        TreeSet treeSet = new TreeSet();
        treeSet.addAll(Arrays.asList(9, 2, 3, 4, 1, 5, 2, 3));
        System.out.println("treeSet: " + treeSet);
        TreeSet treeSet2 = new TreeSet();
        treeSet2.addAll(Arrays.asList("Bird", "Dog", "Ant", "Snake"));
        System.out.println("treeSet2: " + treeSet2);
    }

    private static void PriorityQueue() {
        System.out.println("PriorityQueue");
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(9);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(4);
        priorityQueue.add(5);
        priorityQueue.offer(8);
        priorityQueue.offer(7);
        priorityQueue.offer(6);
        System.out.println("priorityQueue: " + priorityQueue);
        System.out.println("poll: " + priorityQueue.poll());
        System.out.println("poll: " + priorityQueue.poll());
        System.out.println("peek: " + priorityQueue.peek());
        System.out.println("element: " + priorityQueue.element());
        int size = priorityQueue.size();
        for (int i = 0; i < size; i++) {
            System.out.println("poll: " + priorityQueue.poll());
        }
        System.out.println("priorityQueue: " + priorityQueue);
    }

    private static void Map() {
        System.out.println("Map");
        HashMap<String, String> hashmap = new HashMap();
        hashmap.put("Java", "Java");
        hashmap.put("Dart", "Dart");
        hashmap.put("Dart2", "Dart");
        hashmap.put("Python", "Python");
        hashmap.put("C#", "C#");
        System.out.println("hashmap: " + hashmap);
        for (Map.Entry m : hashmap.entrySet()) {
            System.out.println("m: " + m);
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Java", "Java");
        linkedHashMap.put("Dart", "Dart");
        linkedHashMap.put("Dart2", "Dart");
        linkedHashMap.put("Python", "Python");
        linkedHashMap.put("C#", "C#");
        System.out.println("linkedHashMap: " + linkedHashMap);
        for (Map.Entry l : linkedHashMap.entrySet()) {
            System.out.println("l: " + l);
        }
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Java", 2);
        treeMap.put("Dart", 3);
        treeMap.put("Dart2", 4);
        treeMap.put("Python", 5);
        treeMap.put("C#", 6);
        System.out.println("treeMap: " + treeMap);
        for (Map.Entry t : treeMap.entrySet()) {
            System.out.println("t: " + t);
        }
        linkedHashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }

}
