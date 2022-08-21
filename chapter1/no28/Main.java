package chapter1.no28;

class Outer {
    private static int a = 1;
    private int b = 2;

    void methodOuter(final int c, int d) {
        final int e = 5;
        int f = 6;

        // ローカルクラス
        class A {
            void method() {
                // ローカルクラスの中のメソッドからエンクロージングクラスのメンバ変数、
                // エンクロージングメソッドのローカル変数にアクセス可能
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
                System.out.println(f);  // ローカルクラスの外で値の再代入をすると、ここでコンパイルエラーが起きる。

                // ローカルクラス内のメソッドから参照するエンクロージングメソッドのローカル変数は、
                // final または実質 final でないといけないので、
                // 値の再代入を行うとコンパイルエラーとなる
                // d = 10;
                // f = 20;

                // ラムダ式みたいなもんよ
            }
        }

        new A().method();

        // ローカルクラスの外で値の再代入をしても当然コンパイルエラー
        // ただし、コンパイルエラーはローカルクラス内で変数を参照している行で起こる
        // f = 10;
    }
}

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.methodOuter(3, 4);
    }
}
