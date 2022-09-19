package chapter4.no4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] ary = {"CCC", "AAA", "BBB"};

        // HashSet お試し
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(ary[0]);
        hashSet.add(ary[1]);
        hashSet.add(ary[2]);
        // 既に格納されている値を追加しても無視される。コンパイルエラーにも実行時エラーにもならない。
        hashSet.add(ary[0]);

        System.out.println("HashSet size: " + hashSet.size());
        for (String s : hashSet) {
            System.out.print(s + " ");
        }

        System.out.println();

        // TreeSet お試し。
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add(ary[0]);
        treeSet.add(ary[1]);
        treeSet.add(ary[2]);
        // TreeSet も同様に、同じ値は無視される。↓は要素として追加されない。
        treeSet.add(ary[0]);

        System.out.println("TreeSet size: " + treeSet.size());
        for (String s : treeSet) {
            System.out.print(s + " ");
        }
    }
}
