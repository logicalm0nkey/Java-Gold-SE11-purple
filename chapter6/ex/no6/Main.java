package chapter6.ex.no6;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 初期値 "1"、 UnaryOperator として文字列 "1" を連結していく操作を指定した Stream.iterate()。
        var stream = Stream.iterate("1", n -> n + "1");
        System.out.println(stream.limit(5).filter(s -> s.length() < 3));
    }
}
