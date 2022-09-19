package chapter4.no14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // メソッドの仮引数でジェネリクスの型が宣言されていれば、呼び出し元の実引数はダイアモンド演算子を使える
        // 要は、オブジェクトを参照する変数でジェネリクスの型が指定されていれば、
        // オブジェクトの new ではダイアモンド演算子が使えるってこと
        methodA(new ArrayList<>());

        List<String> list = methodB();
    }

    static void methodA(List<String> list) {
        System.out.println("methodA");
        list.add("B");
    }

    // 仮引数でダイアモンド演算子は使えない。コンパイルエラー。
    // もっと一般に、参照変数の宣言時にはダイアモンド演算子は使えない。
    // あくまでも、オブジェクトを new するときだけダイアモンド演算子を使える。
    // static void methodA(List<> list) { }

    // 戻り値の型宣言ではジェネリクスの型を指定する必要がある。ダイアモンド演算子は使えない。
    // return という名の一時変数（参照変数）の型宣言だから。
    static ArrayList<String> methodB() {
        System.out.println("methodB");
        // return するオブジェクトでは new が使える。
        return new ArrayList<>();
    }

    // これはコンパイルエラー。
    // static ArrayList<> methodC() {
    // }
}
