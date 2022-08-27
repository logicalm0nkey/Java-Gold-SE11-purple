package chapter2.no8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        m(new ArrayList<String>());
    }

    // @SafeVarargs をつけると、メソッドシグニチャの警告だけでなく、呼び出し元の警告も抑制する。
    @SafeVarargs
    // @SuppressWarnings をつけると、メソッドシグニチャの警告だけ抑制する。
    // @SuppressWarnings("unchecked")
    static void m(List<String>... lists) {

    }

    // final、static、private のいずれかでないと @SafeVarargs をつけたときにコンパイルエラーが発生する
    // @SafeVarargs
    // void method(List<String>... lists) {

    // }

    @SafeVarargs
    private void method(List<String>... lists) {

    }

    @SafeVarargs
    final void method2(List<String>... lists) {

    }
}
