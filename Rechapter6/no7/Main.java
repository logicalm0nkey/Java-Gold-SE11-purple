package Rechapter6.no7;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> optional1 = Optional.of(1);
        Optional<Integer> optional2 = Optional.empty();

        System.out.println("optional1.get(): "  + optional1.get());
        // 空の Optional オブジェクトに get メソッドを使用すると実行時エラー
        // System.out.println("optional2.get(): "  + optional2.get());

        System.out.println("optional1.isPresent(): "  + optional1.isPresent());
        System.out.println("optional2.isPresent(): "  + optional2.isPresent());

        System.out.println("optional1.isEmpty(): "  + optional1.isEmpty());
        System.out.println("optional2.isEmpty(): "  + optional2.isEmpty());
    }
}
