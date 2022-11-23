package Rechapter2.no11;

public class Foo {

    // メンバメソッドを複数持つ場合は、全てのメンバの値を宣言しないとコンパイルエラーとなる。
    @MyAnnot(rank = MyAnnot.Rank.A, item = "test", num = 10)
    public void method() {

    }
}
