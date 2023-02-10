package Rechapter5.no15;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // ラムダ式OK1
        BiFunction<String, Integer, Character> biFunction1 = (s, i) -> s.charAt(i);
        System.out.println(biFunction1.apply("Java", 2));

        // ラムダ式OK2
        // 1 と引数の順番が逆
        BiFunction<Integer, String, Character> biFunction2 = (i, s) -> s.charAt(i);
        System.out.println(biFunction2.apply(2, "Java"));

        // インスタンスメソッド参照OK
        // この場合、第1引数(String)がメソッドを使うためのインスタンスとして解釈され、第２引数(Integer)がメソッドに渡される引数の型として解釈される。
        BiFunction<String, Integer, Character> biFunction3 = String::charAt;
        System.out.println(biFunction3.apply("Java", 2));

        // インスタンスメソッド参照NG コンパイルエラー
        // この書き方だと charAt の引数が (Integer, String) と解釈されるらしい
        // Integer 型に charAt メソッドはないので、 String 型のメソッド参照として charAt(Integer, String) が書かれたと解釈されるっぽい
        // BiFunction<Integer, String, Character> biFunction4 = String::charAt;
    }
}
