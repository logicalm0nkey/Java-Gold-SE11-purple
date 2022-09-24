package chapter5.no21;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // String から Character を取得
        Function<String, Character> f1 = s -> s.charAt(0);
        // Character が大文字か判定
        Function<Character, Boolean> f2 = c -> Character.isUpperCase(c);

        // f1 と f2 の合成。 f1 を行った後に f2 を行う。合成関数じゃん。
        // 数学でいう f2∘f1()
        Function<String, Boolean> f3 = f1.andThen(f2);
        System.out.println(f3.apply("Hoge"));
        System.out.println(f3.apply("hoge"));

        // メソッドチェーンで直接呼ぶことも可能。神。
        System.out.println(f1.andThen(f2).apply("hoge"));

        // f1 と f2 の合成。 f2 を行った後に f1 を行う。
        // 数学でいう f1∘f2()
        Function<String, Boolean> f4 = f2.compose(f1);
        System.out.println(f4.apply("Hoge"));
    }
}
