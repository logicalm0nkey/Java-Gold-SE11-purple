package chapter2.no11;

import chapter2.no11.MyAnnotation.RANK;

// アノテーションの定義で default を使って初期値を設定していないメンバの値は、利用する側で初期値を設定する必要がある。
// 下の rank は、アノテーションの定義側で default を設定しているので、この書き方でもコンパイルが通る。
@MyAnnotation(/* rank = RANK.A, */ item = "hoge", num = 0)
public class Foo {
    public void method() {

    }
}
