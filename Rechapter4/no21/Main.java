package Rechapter4.no21;

import java.util.*;

// ソートされるオブジェクトとそうでないオブジェクトを比較する
public class Main {
    public static void main(String[] args) {
        // HashSet はソートされない
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(300);
        hashSet.add(20);
        hashSet.add(500);
        System.out.println("HashSet: " + hashSet);

        // TreeSet はソートされる
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(300);
        treeSet.add(20);
        treeSet.add(500);
        System.out.println("TreeSet<Integer>: " + treeSet);

        // 文字と数字が混じっていてもソートされる (文字コード順かな？)
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("nao");
        treeSet2.add("Nao");
        treeSet2.add("500");
        System.out.println("TreeSet<String>: " + treeSet2);

        // キーでソートされるマップ TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("2", 300);
        treeMap.put("3", 20);
        treeMap.put("1", 500);
        System.out.println("TreeMap: " + treeMap);
    }
}
