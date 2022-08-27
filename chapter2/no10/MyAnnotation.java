package chapter2.no10;

// java.lang.annotation.Annotation インターフェースを継承したインターフェースとして定義される。
public @interface MyAnnotation {
    // アノテーションのメンバ変数は抽象メソッドとして定義する。 C# のプロパティみたいな扱いなのかな？
    String value();

    // 戻り値にはプリミティブタイプ、immutableな型、String型、Class型、列挙型、アノテーション型、これらの1次元配列だけを
    // 指定できる。下の Integer 型は上記に当てはまらないので、コンパイルエラーとなる。
    //Integer value();
}
