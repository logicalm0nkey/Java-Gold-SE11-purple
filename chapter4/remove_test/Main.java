package chapter4.remove_test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(12);
        c.add(1);

        // remove() メソッドでは、指定した要素のうち「最初に見つかったもの」が削除される。
        c.remove(1);

        for (var v : c) {
            System.out.println(v);
        }
    }
}
