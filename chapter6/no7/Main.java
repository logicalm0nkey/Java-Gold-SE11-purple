package chapter6.no7;

import java.util.Arrays;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // IntStream.range() メソッド。第1引数以上、第2引数未満の整数からなるデータソースを提供する。
        int[] ary1 = IntStream.range(1, 10).toArray();
        // IntStream.rangeClosed() メソッド。両端の値を含むデータソースを提供する。 closed set 。
        int[] ary2 = IntStream.rangeClosed(1, 10).toArray();

        // Stream.toArray() メソッド。 Object[] を返す。
        Object[] ary3 = Stream.of("a", "b", "c").toArray();
        // Stream.toArray(IntFunction) メソッド。 IntFunction の戻り値の型の配列を返す。今回なら String[] 。
        String[] ary4 = Stream.of("a", "b", "c").toArray(i -> new String[i]);

        System.out.println(Arrays.toString(ary1));
        System.out.println(Arrays.toString(ary2));
        System.out.println(ary3.getClass());
        System.out.println(ary4.getClass());
        System.out.println(Arrays.toString(ary4));
    }
}
