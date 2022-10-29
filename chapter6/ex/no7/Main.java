package chapter6.ex.no7;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 初期値10かつ50以下の Integer 型 Stream を、10ずつ加算する規則で生成。
        var stream = Stream.iterate(10, n -> n <= 50, n -> n + 10);
        // 30の倍数があるかチェック
        boolean ans = stream.anyMatch(n -> n % 30 == 0);
        // stream の要素数を取得。
        // 終端操作を2個以上書いてもコンパイルは通る。実行時エラーとなる。
        // Stream インターフェースで定義されているメソッドなので、構文的には間違っていない。
        long count = stream.count();
        System.out.println(ans + " " + count);
    }
}
