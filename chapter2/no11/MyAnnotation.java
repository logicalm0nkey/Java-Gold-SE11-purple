package chapter2.no11;

public @interface MyAnnotation {
    public enum RANK {
        A,
        B,
        C,
    }

    //RANK rank();
    // こんな感じで default キーワードを使って初期値を設定すると、利用する側で初期値を設定する必要が無くなる。
    // 当然、利用する側でこの初期値を上書きすることもできる。
    RANK rank() default RANK.B;

    String item();

    int num();

    // アノテーションのメンバの初期値は定数でないといけない。
    // 以下の new と null はコンパイルエラーとなる。
    // String str1() default new String();
    String str2() default "new String()";
    // String str3() default null;
}
