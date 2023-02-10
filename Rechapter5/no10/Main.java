package Rechapter5.no10;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // ラムダ式を使った書き方
        Function<String, Integer> f1 = s -> Integer.parseInt(s);
        System.out.println("ラムダ式: " + f1.apply("10"));

        // static メソッド参照を使った書き方
        // apply() が String 型の引数を1個受け取り、 parseInt() も同様であることから、この書き方ができる
        Function<String, Integer> f2 = Integer::parseInt;
        System.out.println("メソッド参照: " + f2.apply("20"));
    }
}
