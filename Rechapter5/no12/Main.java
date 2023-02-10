package Rechapter5.no12;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // ラムダ式
        Comparator<Integer> comparator1 = (x, y) -> Integer.compare(x, y);
        System.out.println("ラムダ式で比較: " + comparator1.compare(1, 2));
        System.out.println("ラムダ式で比較: " + comparator1.compare(2, 1));

        // static メソッド参照
        Comparator<Integer> comparator2 = Integer::compare;
        System.out.println("static メソッド参照で比較: " + comparator2.compare(1, 2));
        System.out.println("static メソッド参照で比較: " + comparator2.compare(2, 1));
    }
}
