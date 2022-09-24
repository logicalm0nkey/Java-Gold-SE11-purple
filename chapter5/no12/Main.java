package chapter5.no12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ラムダ式
        Comparator<Integer> comparator0 = (x, y) -> Integer.compare(x, y);
        // メソッド参照
        Comparator<Integer> comparator = Integer::compare;

        System.out.println("メソッド参照 " + comparator.compare(1, 2));
        System.out.println("ラムダ式 " + comparator0.compare(1, 2));
        System.out.println(comparator.compare(2, 1));
    }
}
