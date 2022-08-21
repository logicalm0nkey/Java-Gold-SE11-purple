package chapter1.no24;

class Outer {
    private int val1 = 100;
    private static int val2 = 200;

    // インナークラス
    class A {
        // A のインスタンスメソッド
        void method1() {
            System.out.println("Outer.A.method1() instance val1 = " + val1);
            System.out.println("Outer.A.method1() static val2 = " + val2);
        }

        // A の static メソッド
        static void method2() {
            // これは static メソッドから外側のクラスの非 static メンバへアクセスしてるのでコンパイルエラー
            //System.out.println("Outer.A.method1() instance val1 = " + val1);
            System.out.println("Outer.A.method2() static val2 = " + val2);
        }
    }

    // static クラス
    static class B {
        void method1() {
            // static クラスから外側のクラスのインスタンスメンバへアクセスすることはできない
            // コンパイルエラー
            //System.out.println("Outer.A.method1() instance val1 = " + val1);
            System.out.println("Outer.B.method1() static val2 = " + val2);
        }

        static void method2() {
            // 同様にコンパイルエラー
            // System.out.println("Outer.A.method1() instance val1 = " + val1);
            System.out.println("Outer.B.method2() static val2 = " + val2);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // アウタークラスを new しないでインナークラスだけを new しようとするとコンパイルエラーとなる
        // Outer.A a = new A();

        // インナークラスのインスタンス化はこう書く
        // インナークラスはアウタークラスのインスタンスメンバ扱いなので new してから new する。
        Outer.A a = new Outer().new A();
        // static クラスはアウタークラスのクラスメンバ扱いなので
        // クラス名.(static クラス名) と書く
        Outer.B b = new Outer.B();

        a.method1();
        a.method2();
        b.method1();
        b.method2();
        Outer.B.method2();
    }
}
