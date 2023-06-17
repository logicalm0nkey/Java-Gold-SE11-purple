package chapter8.no24;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        Arrays.asList("a", "b", "c", "d", "e")
                .parallelStream()
                .forEachOrdered(s -> // System.out.print(s + " ")
                System.out.println(Thread.currentThread().getName() + ": " + s + " ")
                );
        System.out.println();

        // スレッドセーフなリスト。要素の追加・更新・削除をするたびに元のリストをコピーするやつ。
        List<String> list = new CopyOnWriteArrayList<>();

        Arrays.asList("a", "b", "c", "d", "e")
                .parallelStream()
                .map(s -> {
                    System.out.println(Thread.currentThread().getName() + ": " + s + " ");
                    list.add(s);
                    return s.toUpperCase();
                })
                .forEachOrdered(s -> // System.out.print(s + " ")
                System.out.println(Thread.currentThread().getName() + ": " + s + " "));
        System.out.println();

        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
