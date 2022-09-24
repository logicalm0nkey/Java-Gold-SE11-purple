package chapter5.no11;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2);

        // Consumer<List<Integer>>.accept() は、 List<Integer> を受け取って処理をする。
        // Collections.sort() も同じく。よってメソッド参照の書き方ができる。
        Consumer<List<Integer>> con = Collections::sort;

        // ソートされる。
        con.accept(list);
        System.out.println(list);
    }
}
