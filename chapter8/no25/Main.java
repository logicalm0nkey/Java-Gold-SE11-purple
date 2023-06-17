package chapter8.no25;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("c", "a", "d", "b");

        Optional<String> result1 = list.parallelStream().findFirst();
        Optional<String> result2 = list.parallelStream().findAny();

        System.out.println(result1.get() + " " + result2.get());
    }
}
