package Rechapter5.no8;

import java.util.function.Function;

public class Main {
    int a = 10;

    public void method() {
        final int b = 20;
        // 実質 final
        int c = 30;
        int d = 40;
        d = 50;
        // 実質 final
        int e = 60;

        Function<String, String> f = str -> {
            // 外側クラスのメンバ変数はアクセス可能
            System.out.println("a: " + a);
            // final ローカル変数（定数）はアクセス可能
            System.out.println("b: " + b);
            // 実質 final のローカル変数もアクセス可能
            System.out.println("c: " + c);
            // final でも実質 final でもないローカル変数はアクセス不可能
            // コンパイルエラー
            // System.out.println("d: " + d);
            System.out.println("e: " + e);

            return "hello " + str;
        };

        // ラムダ式を定義した後のコードで値を変えるのもダメ
        // これを書くとコンパイルエラー（ラムダ式の中でコンパイルエラーとなる）
        // e = 10;

        System.out.println(f.apply("world!"));
    }

    public static void main(String[] args) {
        new Main().method();
    }
}
