package Rechapter5.no11;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 1, 2);
        // 匿名クラスを使った実装
        Consumer<List<Integer>> consumer1 = new Consumer<List<Integer>>() {
            public void accept(List<Integer> list) {
                Collections.sort(list);
            }
        };
        consumer1.accept(list1);
        System.out.println("匿名クラス: " + list1);

        List<Integer> list2 = Arrays.asList(3, 1, 2);
        // ラムダ式
        Consumer<List<Integer>> consumer2 = list -> Collections.sort(list);
        consumer2.accept(list2);
        System.out.println("ラムダ式: " + list2);

        List<Integer> list3 = Arrays.asList(3, 1, 2);
        // メソッド参照
        Consumer<List<Integer>> consumer3 = Collections::sort;
        consumer3.accept(list3);
        System.out.println("メソッド参照: " + list3);
    }
}
