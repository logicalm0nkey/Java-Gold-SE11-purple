package Rechapter5.no16;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // String クラスのインスタンスメソッド length() をメソッド参照で呼ぶ
        Function<String, Integer> function1 = String::length;
        System.out.println(function1.apply("hoge"));

        // String クラスの static メソッド valueOf(int) をメソッド参照で呼ぶ
        Function<Integer, String> function2 = String::valueOf;
        System.out.println(function2.apply(2));

        // Integer クラスのインスタンスメソッド hashCode() （Object クラスのやつ）
        Function<Integer, Integer> function3 = i -> i.hashCode();
        System.out.println(function3.apply(2));

        // Integer クラスの static メソッド hashCode(int) か、インスタンスメソッド hashCode() か判断がつかないのでコンパイルエラー
        // Function<Integer, Integer> function4 = Integer::hashCode;
    }
}
