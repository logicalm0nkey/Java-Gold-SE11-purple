package chapter4.no18;

// 継承を利用したジェネリクス
// extends の後に書いたクラス（or インターフェース）を継承（or 実装）したクラスだけ使える
class Gen<T extends Number> {
    private T var;

    public Gen(T var) {
        this.var = var;
    }

    public void display() {
        System.out.println(var);
    }
}

interface MyInt {
    void method();
}

// インターフェースを実装したクラスに限定したい場合も extends と書く
class Foo<T extends MyInt> {

}

public class Main {
    public static void main(String[] args) {
        // Integer を使ってオブジェクトを生成
        Gen<Integer> g1 = new Gen<>(10);
        g1.display();

        // Double を使ってオブジェクトを生成
        Gen<Double> g2 = new Gen<>(10.0);
        g2.display();

        // String 型は Number クラスを継承していないのでコンパイルエラーとなる
        // Gen<String> g3 = new Gen<>("S");
        // g3.display();
    }
}
