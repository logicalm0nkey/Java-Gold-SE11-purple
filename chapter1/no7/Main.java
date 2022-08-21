package chapter1.no7;

interface Test {
    void bar();
}

// インターフェースの実装もできる
enum Vals implements Test {
    // enum で抽象メソッドを宣言したときは、各列挙子でオーバーライドしないといけない
    // よって、この2つの宣言はコンパイルエラーとなる
    // A,
    // B;
    A {
        void foo() {System.out.println("foo A");}
        // 列挙型がインターフェースを実装するときは、各列挙子の中でインターフェースのメソッドを実装する
        public void bar() {System.out.println("bar A");}
    },
    B {
        void foo() {System.out.println("foo B");}
        public void bar() {System.out.println("bar B");}
    };

    abstract void foo();
}

public class Main {
    public static void main(String[] args) {
        Vals vals = Vals.A;
        vals.foo();
        Vals.B.bar();
    }
}
