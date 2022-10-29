package chapter6.ex.no16;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 問題文のコード
        Stream<Double> stream = Stream.empty();
        // Optional クラスの orElseGet() メソッドは、 Optional の要素の型と同じ型を返す Supplier を引数に取る。
        // 今回の Optional オブジェクトの要素の型は Stream<Double> から作られているので Double 型。
        // よって、このコードはコンパイルエラーとなる。
        System.out.println(stream.findFirst().orElseGet(() -> "empty"));
    }
}
