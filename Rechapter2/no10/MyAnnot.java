package Rechapter2.no10;

public @interface MyAnnot {
    // メンバのメソッドは、普通のインターフェースの抽象メソッドと同じように宣言する。
    String value();

    // メンバの戻り値は、基本型、String型、Class型、列挙型、アノテーション型、
    // 及び上記の1次元配列しか宣言できない。
}
