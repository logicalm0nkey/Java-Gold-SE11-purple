package chapter1.ex.no10;

interface IntA {
    default void print() {
    }

    private void test() {
    }
}

interface IntB {
    void show();

    private void calc() {
    }

    default void print() {
    }
}

// 同じシグネチャの default メソッドを持つインターフェースを多重継承するとコンパイルエラーとなる。
interface IntC extends IntA, IntB {
    // ただし、サブインターフェースでオーバーライドすればコンパイルが通る。
    @Override
    default void print() {

    }
}

public class Main {
    public static void main(String[] args) {

    }
}
