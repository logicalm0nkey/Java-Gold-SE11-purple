package chapter1.ex10;

interface Test {
    void method();
}

interface X extends Test {
    // 親インターフェースの抽象メソッドを default メソッドでオーバーライドできる
    @Override
    default void method() {
        System.out.print("from X");
    }
}

interface Y extends Test {
    @Override
    default void method() {
        System.out.print("from Y");
    }
}

// 2つ以上のインターフェースを実装したとき、各インターフェースで同じ default メソッドを持っていると、
// implements 下だけだとコンパイルエラーとなる。
public class Main implements X, Y {
    public static void main(String[] args) {
        
    }

    // インターフェースを実装したクラス内で更に default メソッドをオーバーライドするとコンパイルが通る。
    @Override
    public void method() {

    }
}

// 2つ以上のインターフェースを継承したインターフェースも同様にコンパイルエラーを起こす
interface Z extends X, Y {
    // ここでも更なるオーバーライドを行えばコンパイルが通る
    @Override
    default void method() {

    }
}