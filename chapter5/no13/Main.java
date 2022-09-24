package chapter5.no13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        System.err.println("拡張 for 分で出力");
        for (int i : list) {
            System.out.println(i);
        }

        System.err.println("forEach() メソッドをラムダ式で記述");
        list.forEach(i -> System.out.println(i));

        System.err.println("forEach() メソッドをメソッド参照で記述");
        list.forEach(System.out::println);
    }
}
