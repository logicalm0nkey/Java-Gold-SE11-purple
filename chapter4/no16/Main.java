package chapter4.no16;

import java.util.*;

class Gen {
    // メソッド定義で型パラメータを使える。型パラメータの有効範囲はメソッド内のみ。
    // 宣言する位置は修飾子と戻り値の間。
    public <T> T methodA(T val) {
        return val;
    }

    // メソッドの型パラメータを別のジェネリクス型の型パラメータで使うことができる。
    static <T> void methodB(List<T> list) {
        for (T obj : list) {
            System.out.println(obj);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Gen gen = new Gen();

        // 呼び出し元は型を指定しないで利用可能
        String s1 = gen.methodA("A");
        // 型を指定してもよい
        String s2 = gen.<String>methodA("B");

        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);

        Gen.methodB(list);
        Gen.<String>methodB(list);
        // 引数の型パラメータと、直接指定している型パラメータが一致しないとコンパイルエラーとなる。安全。
        // Gen.<Integer>methodB(list);
    }
}
