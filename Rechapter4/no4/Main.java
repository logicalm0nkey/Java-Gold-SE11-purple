package Rechapter4.no4;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String[] ary = { "AAA", "BBB", "CCC" };
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(ary[0]);
        hashSet.add(ary[1]);
        hashSet.add(ary[2]);
        // 重複した要素を追加しても無視される。数学の集合と同じ感じ。
        // エラーにはならない。
        hashSet.add(ary[0]);

        // 重複した要素が無視されるので size() = 3
        System.out.println("HashSet size: " + hashSet.size());

        for (String s : hashSet) {
            // 重複した要素が無視されるので3つだけ表示される
            // 順序は保証されないのでランダムな順番で表示される
            System.out.print(s + " ");
        }

        System.out.println();

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add(ary[0]);
        treeSet.add(ary[1]);
        treeSet.add(ary[2]);
        // 重複した要素は無視される。
        treeSet.add(ary[0]);

        // 重複した要素が無視されるので size() = 3
        System.out.println("TreeSet size: " + treeSet.size());

        for (String s : treeSet) {
            // 重複した要素が無視されるので3つだけ表示される
            // 要素はソートされるので A, B, C の順で表示される
            System.out.print(s + " ");
        }
    }
}
