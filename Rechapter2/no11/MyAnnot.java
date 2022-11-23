package Rechapter2.no11;

public @interface MyAnnot {
    // アノテーションのメンバとして列挙型を宣言可能
    public enum Rank {
        A,
        B,
        C,
        D,
    }

    // アノテーションのメンバとして列挙型を返すメソッドを宣言可能
    // Rank rank();

    // メンバメソッドのデフォルト値を設定することもできる
    Rank rank() default Rank.B;
    // この場合、アノテーションの呼出し元では、メンバのデフォルト値の設定は任意となる

    String item();

    // デフォルト値に設定できるのは不変な値のみ（リテラルのみ）。
    // 変更されうる値を設定するとコンパイルエラーとなる。
    //String str1() default new String("");   // これはコンパイルエラー
    String str2() default "";   // これはOK
    //String str3() default null; // これはコンパイルエラー

    int num();
}
