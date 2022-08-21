package chapter1.no15;

interface Foo {
    // private static メソッドを定義できる
    private static void p1() {
        System.out.println("Foo.p1()");
    }

    // private インスタンスメソッドも定義できる
    // default メソッドから呼び出すためのメソッド
    private void p2() {
        System.out.println("Foo.p2()");
    }

    static void methodA() {
        System.out.println("Foo.methodA()");
        p1();
        // 当たり前だが、 static メソッドから非 static メソッドは呼べない
        // コンパイルエラー
        //p2();
    }

    default void methodB() {
        System.out.println("Foo.methodB()");
        // default メソッドからはどちらも呼べる
        p1();
        p2();
    }
}

class FooImp implements Foo {

}

public class Main {
    public static void main(String[] args) {
        // static メソッドの呼び出し
        Foo.methodA();
        // default メソッドはインスタンス化してから呼び出す
        new FooImp().methodB();
    }
}
