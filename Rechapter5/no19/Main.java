package Rechapter5.no19;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // ラムダ式で String[] を生成。 IntFunction を使用。
        IntFunction<String[]> f1 = i -> new String[i];
        // メソッド参照で String[] を生成。 IntFunction を使用。
        // 引数が int 型に決まっているので、それが自動で String[] のサイズになる
        IntFunction<String[]> f2 = String[]::new;
        // IntFunction は戻り値の型が primitive 型ではないので、メソッド名は apply() のまま
        System.out.println("ラムダ式: " + f1.apply(2).length);
        System.out.println("メソッド参照: " + f2.apply(3).length);

        IntFunction<Double> f3 = i -> Math.random() * i;
        Double d = f3.apply(3);
        System.out.println("IntFunction<Double>: " + d);

        // 以下は IntFunction の戻り値が Object 型なのでコンパイルエラーとなる
        // IntFunction f4 = i -> Math.random() * i;
        // Double d2 = f4.apply(2);

        // 戻り値の型が int に決まっているので型パラメータ―は書かない
        IntSupplier s = "Java"::length;
        int l = s.getAsInt();
        System.out.println("IntSupplier: " + l);
    }
}
