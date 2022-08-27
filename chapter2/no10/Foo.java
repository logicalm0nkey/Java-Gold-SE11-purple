package chapter2.no10;

// メンバ変数の値を必ず指定しないといけない。指定しないとコンパイルエラー。
@MyAnnotation(value = "test1")
public class Foo {
    @MyAnnotation("value2")
    public void method() {

    }
}
