package chapter8.no23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.asList("hana", "ken", "mika")
                .stream()
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        Arrays.asList("hana", "ken", "mika")
                .parallelStream()
                .map(s -> {
                    // System.out.print(s + " ");
                    System.out.println(Thread.currentThread().getName() + ": " + s + " ");
                    return s.toUpperCase();
                })
                .forEach(s -> //System.out.print(s + " ")
                System.out.println(Thread.currentThread().getName() + ": " + s + " ")
                );
    }
}
