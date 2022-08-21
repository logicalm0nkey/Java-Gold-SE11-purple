package chapter1.no16;

interface Inter1 {
    static void method() {
        System.out.println("method()");
    }
}

class Obj implements Inter1 {

}

public class Main {
    public static void main(String[] args) {
        Obj obj = new Obj();
        Inter1.method();
        // 参照変数を利用して interface の static メソッドを呼び出すことはできない
        // コンパイルエラー
        // obj.method();

        Inter1 inter = new Obj();
        // 参照変数の型が interface でも無理
        // 同様にコンパイルエラー
        // inter.method();
    }
}
