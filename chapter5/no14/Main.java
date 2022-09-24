package chapter5.no14;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        // ラムダ式
        UnaryOperator<String> operator = s -> s.toUpperCase();
        // コンパイルエラー。参照変数がないため。なんか違うメッセージが出るけど (Undefined 以外のメッセージ) 、まあそういうこと。
        // UnaryOperator<String> operator2 = s::toUpperCase();

        // 参照変数が無いときにインスタンスメソッドに対してメソッド参照の書き方をしたいなら クラス名::メソッド名 と書く。
        // static メソッド参照と同じ書き方。
        UnaryOperator<String> operator2 = String::toUpperCase;

        System.out.println("ラムダ式の結果: " + operator.apply("hoge"));
        System.out.println("メソッド参照の結果: " + operator2.apply("hoge"));
    }
}
