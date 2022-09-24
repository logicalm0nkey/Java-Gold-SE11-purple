package chapter5.no22;

import java.util.function.LongPredicate;

public class Main {
    public static void main(String[] args) {
        // 3の倍数か判定
        LongPredicate p1 = l -> (l % 3) == 0;
        // 5の倍数か判定
        LongPredicate p2 = l -> (l % 5) == 0;

        // Predicate の合成
        // p1 && p2 の場合のみ true
        LongPredicate p3 = p1.and(p2);
        System.out.println(p3.test(10));
        System.out.println(p3.test(15));

        // p1 || p2 のときに true
        System.out.println(p1.or(p2).test(10));
        System.out.println(p1.or(p2).test(7));

        // true, false を反転
        System.out.println(p1.negate().test(9));
    }
}
