package chapter1.no29;

import javax.swing.plaf.metal.MetalBorders.MenuItemBorder;

interface Inter {
    void methodA();
}

class Outer {
    void method() {
        // 匿名クラス
        // クラス定義（インターフェースの実装）とインスタンス化を1つの式で行っている
        // そしてメソッドの呼び出し。
        new Inter() {
            public void methodA() {
                System.out.println("methodA()");
            }
        }.methodA();

        // 当然インスタンス化したオブジェクトへの参照も持てる
        // 関数型インターフェースならラムダ式でいいね。
        Inter i = new Inter() {
            public void methodA() {
                System.out.println("methodA()");
            }
        };

        i.methodA();
    }
}

public class Main {
    public static void main(String[] args) {
        new Outer().method();
    }
}
