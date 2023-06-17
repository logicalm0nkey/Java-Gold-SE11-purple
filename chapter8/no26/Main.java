package chapter8.no26;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer total = Arrays.asList(10, 20, 30, 40, 50)
                // .stream() にすると、普通の reduce() メソッドと同じ処理になる。
                // つまり、1 + 10 + 20 + 30 + 40 + 50 = 151 が出力される。
                // parallel stream の場合は、(1 + 10) + (1 + 20) + (1 + 30) + (1 + 40) + (1 + 50) = 155 となる。
                // つまり、 identity が、各スレッドにおける初期値となる。全体の初期値となるわけではない。
                .parallelStream()
                .reduce(
                        1,
                        (sum, a) -> {
                            System.out.println(Thread.currentThread().getName() +  " sum: " + sum + " a: " + a);
                            return sum += a;
                        },
                        // ここのメソッドは要素の後ろから計算していく。上の例なら
                        // (40 + 50) -> 30 + 90 -> (10 + 20) + 120 となる。
                        // 要素が n 個のとき（以下の数字はインデックス）、
                        // n-1 * n -> n-2 * (n-1 * n) -> n-3 * n-4 -> n-5 * (n-3 * n-4) -> (n-5 * (n-3 * n-4)) * (n-2 * (n-1 * n)) -> ...
                        // という感じ。後ろから2つ計算 -> 1個前の要素と計算 -> また2つ計算 -> 1個前の要素と計算 -> 各計算結果で計算、みたいな…
                        (b, c) -> {
                            System.out.println(Thread.currentThread().getName() +  " b: " + b + " c: " + c);
                            return b + c;
                        });

        System.out.println("total: " + total);
    }
}
