package chapter6.no5;

import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(10, 20, 30);

        // Stream.reduce() メソッドは初期値と2項演算を定義して使う終端操作。
        // 初期値0、2項演算として加算を定義した reduce メソッド。
        // 0 + 10 -> 10, 10 + 20 -> 30, 30 + 30 -> 60 という具合に計算されていく。
        // 最初は初期値を結果にして、結果を a に代入して、 Stream の要素をどんどん b に入れていく感じか。
        int result = stream.reduce(0, (a, b) -> a + b);
        System.out.println(result);

        // Integer.sum() メソッドでもうまくいく。sum() も2項演算なので。
        Stream<Integer> stream2 = Stream.of(10, 20, 30);
        System.out.println(stream2.reduce(0, Integer::sum));
    }
}
