package chapter5.no7;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // 匿名クラス
        String str1 = new Function<String, String>() {
            public String apply(String s) {
                return "Hello " + s;
            }
        }.apply("匿名クラス");
        System.out.println(str1);

        // ラムダ式。略さない ver
        Function<String, String> func = (String s) -> {
            return "Hello " + s;
        };
        System.out.println(func.apply("略さないラムダ式"));

        // ラムダ式。略。
        Function<String, String> func2 = s -> "Hello " + s;
        System.out.println(func2.apply("略したラムダ式"));
    }
}
