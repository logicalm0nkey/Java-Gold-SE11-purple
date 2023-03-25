package Rechapter6.no6;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 1 ~ 9 の IntStream
        int[] ary1 = IntStream.range(1, 10).toArray();
        // 1 ~ 10 の IntStream
        int[] ary2 = IntStream.rangeClosed(1, 10).toArray();

        // 引数無しの toArray メソッドは、戻り値が Object[]
        Object[] ary3 = Stream.of("a", "b").toArray();
        // 配列を new する IntFunction を指定すると、その戻り値の配列が toArray の結果となる
        String[] ary4 = Stream.of("a", "b").toArray(String[]::new);

        System.out.println("ary1: " + Arrays.toString(ary1));
        System.out.println("ary2: " + Arrays.toString(ary2));
        System.out.println("ary3: " + Arrays.toString(ary3) + ": " + ary3.getClass());
        System.out.println("ary4: " + Arrays.toString(ary4) + ": " + ary4.getClass());
    }
}
