package Rechapter2.no13;

// クラスで使おうとするとコンパイルエラー
//@MyAnnot
public class Foo {
    // OK
    @MyAnnot
    private int num;

    // OK
    @MyAnnot
    public void method() {

    }
}
