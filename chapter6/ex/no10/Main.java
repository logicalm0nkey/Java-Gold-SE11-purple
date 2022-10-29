package chapter6.ex.no10;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
        double result = DoubleStream.of(10.0, 20.0, 30.0)
                // double は int へ暗黙の型変換ができないから、ここでコンパイルエラー。
                // DoubleStream インターフェースの mapToInt() メソッドは DoubleToIntFunction を引数に取るので、
                // 戻り値の x は int 型。
                //.mapToInt(x -> x)
                .mapToInt(x -> (int)x)  // これでコンパイルが通る
                .boxed()
                .collect(Collectors.averagingInt(x -> x));
    }
}
