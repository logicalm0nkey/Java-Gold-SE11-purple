package Rechapter6.no15;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of("naoki", "akko", "ami")
                // 引数無しの sorted() は自然順序でソートする
                .sorted()
                // 文字コード順に表示される
                .forEach(s -> System.out.print(s + " "));

        System.out.println();

        Stream.of("naoki", "akko", "ami")
                // 引数に Comparator を指定可能。今回は逆順。
                .sorted(Comparator.reverseOrder())
                // 上と逆順に表示される。
                .forEach(s -> System.out.print(s + " "));
    }
}
