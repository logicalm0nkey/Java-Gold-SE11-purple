package chapter6.ex.no15;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 問題文のコード
        int ans = IntStream.of(10, 20, 30).findFirst().getAsInt();
        System.out.println(ans);

        // 自分が選んだコード
        // Stream インターフェースの mapToInt() メソッドは引数に ToIntFunction を取る。
        // 引数無しで呼んだらコンパイルエラー。
        //int ansB = Stream.of(10, 20, 30).mapToInt().findFirst.getAsInt();

        // 正解のコード。
        int ansC = Stream.of(10, 20, 30).findFirst().get();
        System.out.println(ansC);        
    }
}
