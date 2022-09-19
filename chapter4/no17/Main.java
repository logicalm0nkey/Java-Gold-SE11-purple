package chapter4.no17;

// ジェネリクスを用いたインターフェース
interface MyInt<T> {
    // メソッドの引数で使える
    void method(T t);
}

// ジェネリクスを用いたインターフェースの実装
// implements の後に書くインターフェース名の宣言でジェネリクスの型を宣言する（下の String みたいな感じ）
class Foo implements MyInt<String> {
    // オーバーライドするメソッドも、上で宣言した型を使って書く。
    public void method(String s) {
        System.out.println(s);
    }
}

public class Main {
    public static void main(String[] args) {
        new Foo().method("huoge");
        
        // 匿名クラスを使った記法も可能
        new MyInt<Integer>() {
            public void method(Integer i) {
                System.out.println(i);
            }
        }.method(10);

        // ラムダ式を用いた記法も可能
        // MyInt<String> でジェネリクスの型を宣言しているので、下の s は自動で String 型になる。
        MyInt<String> m = s -> System.out.println(s);
        m.method("piyo");
    }
}
