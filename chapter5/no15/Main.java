package chapter5.no15;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        // ラムダ式で BiFunction を実装
        BiFunction<String, Integer, Character> function1 = (s, i) -> s.charAt(i);
        System.out.println(function1.apply("hoge", 1));
        // ラムダ式で BiFunction を実装2
        BiFunction<Integer, String, Character> function2 = (i, s) -> s.charAt(i);
        System.out.println(function2.apply(1, "huoge"));

        // インスタンスメソッド参照。
        // 第1引数 (String) が、実装の中でメソッドを呼ぶオブジェクトになる。
        // 第2引数 (Integer) が、実装の中でメソッドに渡される引数になる。
        BiFunction<String, Integer, Character> function3 = String::charAt;
        System.out.println(function3.apply("hoge", 1));

        // インスタンスメソッド参照。この書き方はコンパイルエラーとなる。
        // 第1引数と実装の中でメソッドを呼んでいる型が異なるので、下の書き方は static メソッド参照になる。
        // しかし、 String に引数 Integer, String を持つ charAt メソッドは存在しない。
        // したがって、存在しないメソッドを呼んでいるという意味でコンパイルエラーとなる。
        // BiFunction<Integer, String, Character> function4 = String::charAt;
    }
}
