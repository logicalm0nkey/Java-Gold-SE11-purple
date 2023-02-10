package Rechapter5.no22;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // 引数の long 型が3の倍数か判定
        LongPredicate p1 = l -> (l % 3) == 0;
        // 引数の long 型が5の倍数か判定
        LongPredicate p2 = l -> (l % 5) == 0;

        // 15の倍数か判定
        LongPredicate p3 = p1.and(p2);
        System.out.println(p3.test(15));
        System.out.println(p3.test(10));

        // 3 または 5 の倍数であるか判定
        LongPredicate p4 = p1.or(p2);
        System.out.println(p4.test(14));
        System.out.println(p4.test(10));
        System.out.println(p4.test(9));

        // 3の倍数でない又は5の倍数でないとき true
        LongPredicate p5 = p3.negate();
        System.out.println(p5.test(15));
        System.out.println(p5.test(10));
        System.out.println(p5.test(9));
    }
}
