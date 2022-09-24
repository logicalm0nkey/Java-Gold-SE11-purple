package chapter5.no8;

import java.util.function.Function;

public class Main {
    // 実質 final なメンバ変数
    static int a = 10;
    public static void main(String[] args) {
        a = 11;

        final int b = 20;
        // 実質 final
        int c = 30;
        int d = 40;
        d = 44;
        // 実質 final
        int e = 50;        

        Function<String, String> func = (String str) -> {
            // メンバ変数やクラス変数は final じゃなくてもOK
            System.out.println("a = " + a);
            // final is ok
            System.out.println("b = " + b);
            // 実質 final なローカル変数も OK
            System.out.println("c = " + c);

            // final でなく、かつ実質 final でもないローカル変数はラムダ式の中から参照するとコンパイルエラーとなる。
            // System.out.println("d = " + d);

            // ラムダ式の中でローカル変数の値を変更するのもダメ。コンパイルエラー。
            // e = 55;

            return "hello " + str;
        };

        // ラムダ式を宣言した後で値を変えてもコンパイルエラーとなる。
        // コンパイルエラーが発生する場所はラムダ式の中。
        // c = 33;

        System.out.println(func.apply("neko"));
    }
}
