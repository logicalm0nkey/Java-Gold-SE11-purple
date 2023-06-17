package chapter8.no27;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("orange", "banana", "lemon");

        List<String> result = list.parallelStream()
                .collect(() -> new CopyOnWriteArrayList<>(),
                        (suppliedList, str) -> suppliedList.add(str.toUpperCase()),
                        (list1, list2) -> list1.addAll(list2));

        for (String s : result) {
            System.out.print(s + " ");
        }

        System.out.println();

        Set<String> set = list.parallelStream()
                // .collect(() -> new CopyOnWriteArraySet<>(),
                //         (suppliedSet, str) -> suppliedSet.add(str),
                //         (set1, set2) -> set1.addAll(set2));
                // ↑と同じコードをメソッド参照で書いたバージョン
                .collect(CopyOnWriteArraySet::new, Set::add, Set::addAll);
        
        for (String s : set) {
            System.out.print(s + " ");
        }
    }
}
