package chapter6.no8;

import java.lang.StackWalker.Option;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.of(10);
        Optional<Integer> o2 = Optional.empty();

        System.out.println("Optional.of() の結果の get(): " + o1.get());
        // empty の Optional に対して get() メソッドを呼ぶと実行時例外が発生する
        //System.out.println("Optional.empty() の結果の get(): " + o2.get());

        System.out.println("Optional.of() の結果の isPresent(): " + o1.isPresent());
        System.out.println("Optional.empty() の結果の isPresent(): " + o2.isPresent());

        System.out.println("Optional.of() の結果の isEmpty(): " + o1.isEmpty());
        System.out.println("Optional.empty() の結果の isEmpty(): " + o2.isEmpty());
    }
}
