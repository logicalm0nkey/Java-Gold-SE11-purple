package chapter6.no16;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 昇順にソートして表示
        Stream.of("hoge", "pako", "fgu")
            .sorted()
            .forEach(x -> System.out.print(x + " "));
        System.out.println();
        
        // 降順にソートして表示
        Stream.of("hoge", "pako", "fgu")
            .sorted(Comparator.reverseOrder())
            .forEach(x -> System.out.print(x + " "));
    }
}
