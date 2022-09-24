package chapter5.no20;

import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        // 引数が String、戻ちりが int
        ToIntFunction<String> f1 = s -> s.length();
        // メソッド名は applyAsInt
        System.out.println("ToIntFunction<String> ラムダ式: " + f1.applyAsInt("hoge"));

        // 引数が String、戻ちりが int
        ToIntFunction<String> f2 = String::length;
        // applyAsInt
        System.out.println("ToIntFunction<String> メソッド参照: " + f2.applyAsInt("hoge"));

        // int を double に変換する function
        IntToDoubleFunction intToDoubleFunction = i -> i * 1.08;
        // メソッド名は applyAsDouble
        System.out.println("IntToDoubleFunction ラムダ式: " + intToDoubleFunction.applyAsDouble(3));

        // プリミティブ型に変換する関数型インターフェースの戻り値はラッパークラスへオートボクシング可能
        Integer integer = f1.applyAsInt("Integer");

        // しかし、プリミティブ型を変換する関数型インターフェースの引数は自動でオートボクシングされない
        // というか、一般にラムダ式の引数では自動的な型変換が行われないらしい（コンパイルエラーのメッセージを見るとそう伺える）
        // IntToDoubleFunction hoge = (Integer i) -> i * 0.2;
    }
}
