package chapter4.no21;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HashSet クラス。ソートされないコレクション。
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(300);
        hashSet.add(20);
        hashSet.add(500);
        System.out.println("HashSet: " + hashSet);

        // TreeSet クラス。ソートされるコレクション。
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(300);
        treeSet1.add(20);
        treeSet1.add(100);
        System.out.println("TreeSet<Integer>: " + treeSet1);

        // TreeSet クラス。ソートされるコレクション。
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("nao");
        treeSet2.add("Nao");
        treeSet2.add("100");
        System.out.println("TreeSet<String>: " + treeSet2);

        // TreeMap クラス。キーでソートされるコレクション。
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("2", 3);
        treeMap.put("3", 2);
        treeMap.put("1", 10);
        System.out.println("TreeMap: " + treeMap);
    }
}
