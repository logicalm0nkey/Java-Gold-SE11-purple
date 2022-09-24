package chapter5.no16;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // String クラスのインスタンスメソッド参照
        // こちらは Function の第1引数の型と実装でメソッドを呼んでいる型が一致しているので、インスタンスメソッド参照となる
        Function<String, Integer> func = String::length;
        System.out.println(func.apply("hoge"));

        // String クラスの static メソッド参照
        // こちらは Function の第1引数の型と実装でメソッドを呼んでいる型が不一致なので、
        // String 型の static メソッド参照となる。そして、その static メソッドの引数に Integer が渡される。
        Function<Integer, String> func2 = String::valueOf;
        System.out.println(func2.apply(10));

        // Integer クラスのインスタンスメソッド参照
        // ラムダ式の記述はOK
        Function<Integer, Integer> func3 = i -> i.hashCode();
        // この場合はメソッド参照の書き方はダメ。
        // Integer には static メソッド Integer.hashCode(int) と、インスタンスメソッド Integer.hashCode() がある。
        // 下の書き方では、 Function の第1型パラメータ Integer に対し、
        // 引数無しの static メソッドを呼んでいるのか、
        // Integer.hashCode(int) を呼んでいるのか判別できないのでコンパイルできない。
        // コンパイルエラー。
        // Function<Integer, Integer> func4 = Integer::hashCode;
    }
}
