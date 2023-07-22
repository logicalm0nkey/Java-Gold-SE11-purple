package chapter9.no12;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        String compName = "SE社";
        String name = "tanaka";
        int age = 20;

        // Formatter をインスタンス化
        Formatter formatter = new Formatter();

        // Formatter.format() メソッドで、書式化された文字列をバッファリングしていく
        formatter.format("会社名は %s です。\n", compName);
        formatter.format("名前: %s、年齢: %d\n", name, age);

        // バッファリングされた文字列がここで出力される。
        // Formatter は toString() メソッドを実装しているので、書式化された文字列が勝手に出力される。
        System.out.println(formatter);

        // PrintWriter クラスも format() メソッドを定義しているので、 System.out から使える
        System.out.format("会社名は %s です。\n", compName);
        System.out.format("名前: %1$s、年齢: %2$d\n", name, age);
    }
}
