package chapter6.ex.no1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "dd", "e"));
        System.out.println(list);

        // Collection.remove() は引数に Object を取る。
        list.remove("a");
        System.out.println(list);

        // Collection.removeAll() は引数に Collection を取る。
        list.removeAll(Arrays.asList("b", "c"));
        System.out.println(list);

        // Collection.removeIf() は引数に Predicate を取る。
        // したがって Collection インターフェースの removeIf() メソッドはラムダ式で実装を書ける。
        list.removeIf(s -> s.length() > 1);
        System.out.println(list);

        // Comparator は関数型インターフェースなのでラムダ式で実装可能。
        // Comparable も関数型インターフェースだが、比較対象のオブジェクト自身が実装することを前提としたインターフェースなので
        // ラムダ式で実装する意味がない。今回なら Integer での実装を使用する。
        Comparator<Integer> comparator = (i1, i2) -> i1.compareTo(i2);
        System.out.println("2, 2 比較: " + comparator.compare(2, 2));
        System.out.println("2, 3 比較: " + comparator.compare(2, 3));
        System.out.println("3, 2 比較: " + comparator.compare(3, 2));
    }
}
