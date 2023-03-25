package Rechapter6.no3;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // count() メソッドは戻り値が long 型なので注意
        long result1 = Stream.of("a", "b", "c").count();
        System.out.println(result1);

        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::print);
        System.out.println();

        // 型が一致していない要素を of() メソッドに突っ込んでもOK
        long result2 = Stream.of("a", 2).count();
        System.out.println(result2);

        // Stream インターフェースは Iterable インターフェースを継承していないので for 文で使えない。コンパイルエラー。
        // for (String s : stream) {
        //     System.out.print(s);
        // }
    }
}
