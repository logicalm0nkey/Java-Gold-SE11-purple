package chapter5.no10;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> func = Integer::parseInt;
        System.out.println(func.apply("100"));
    }
}
