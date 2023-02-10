package Rechapter5.no13;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(3, 1, 2);

        // forEach メソッドを使わない出力
        for (int a : list1) {
            System.out.print(a);
        }
        System.out.println();

        // forEach メソッドとラムダ式を使った出力
        list1.forEach(a -> System.out.print(a));
        System.out.println();

        // メソッド参照を使った出力
        list1.forEach(System.out::print);
    }
}
