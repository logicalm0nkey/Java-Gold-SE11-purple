package chapter6.no15;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10);
        List<Integer> list2 = Arrays.asList(20, 30);
        List<Integer> list3 = Arrays.asList(40, 50, 60);

        List<List<Integer>> dataList = Arrays.asList(list1, list2, list3);

        // map を使用して dataList を表示
        // List を要素に持つ Stream を作成。
        // 各 List を Stream に変換した Stream を作成 (map の部分) 。つまり、 Stream を要素に持つ Stream を作成。
        // 親 Stream の各要素に Consumer を適用 (最初の forEach) 。
        // 各要素が Stream だから、 Consumer の中で再度 Consumer を実装している (入れ子の中の forEach) 。
        dataList.stream()
                .map(data -> data.stream())
                .forEach(x -> {
                    x.forEach(y -> System.out.print(y + " "));
                });
        System.out.println();

        // flatMap を使用して dataList を表示
        dataList.stream()
                .flatMap(data -> data.stream())
                .forEach(x -> System.out.print(x + " "));
    }
}
