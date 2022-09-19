package chapter4.no2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // これは暗黙の型変換が行われるからOK
        double d1 = 10;
        // int 型のリテラルは Double 型の変数に入れられない。暗黙の型変換が行われない。コンパイルエラー。
        // Double d2 = 10;
        // boxing を行いたいなら d2 = 10.0; と書かないといけない。
        Double d2 = 10.0;

        Long l1 = null;
        // Unboxing は Long 型の longValue() メソッドで行われるので、ここでぬるぽが発生する。
        // 実行時エラー（ぬるぽ）
        // long l2 = l1;

        Long l3 = null;
        // ぬるぽ
        // l3++;

        Map<String, Long> map = new HashMap<>();
        // とにかく Long 型の値は long 型に Unboxing できるので、この書き方はコンパイルは通る。
        // しかし map 内で値のマッピングを行っていないのでぬるぽが発生する。
        long l4 = map.get("hoge");
    }
}
