package chapter5.no19;

import java.util.function.IntFunction;
import java.util.function.IntSupplier;

public class Main {
    public static void main(String[] args) {
        // int 型の引数の apply() メソッドを持つ IntFunction の例。
        // apply() メソッドの引数が int 型に決まっているので、変数宣言時に指定する型は戻り値の型だけでよい。
        IntFunction<String[]> func1 = i -> new String[i];
        System.out.println("ラムダ式で IntFunction<String[]>: " + func1.apply(5).length);

        // もちろんメソッド参照でも書ける
        IntFunction<String[]> func2 = String[]::new;
        System.out.println("メソッド参照で IntFunction<String[]>: " + func2.apply(5).length);

        // これは戻り値が Double 型の apply()
        IntFunction<Double> func3 = i -> Math.random() * i;
        System.out.println("IntFunction<Double>: " + func3.apply(5));

        // この書き方は戻り値が Object になる
        IntFunction func4 = i -> Math.random() * i;
        // func4.apply() の戻り値はあくまで Object 型なので、 Double 型にそのまま突っ込むとコンパイルエラーとなる。
        // Double d = func4.apply(1);

        // Supplier の int 型バージョン。戻り値が常に int 型なので、変数宣言で型を指定しないでよい。
        // というか指定するとコンパイルエラーとなる。
        IntSupplier supplier = "Java"::length;
        // 値を取得するときは get じゃなくて getAsInt() メソッドを使う。
        System.out.println("IntSupplier.getAsInt(): " + supplier.getAsInt());
        
    }
}
