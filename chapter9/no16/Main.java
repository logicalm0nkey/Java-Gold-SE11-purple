package chapter9.no16;

import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("C:/sample/chap9/16/data.txt");

        System.out.format("1 to 4: %s%n", path.subpath(1, 4));
        System.out.format("0 to 2: %s%n", path.subpath(0, 2));
        // 下2つは IllegalArgumentException
        // System.out.format("1 to 5: %s%n", path.subpath(1, 5));
        // System.out.format("2 to 2: %s%n", path.subpath(2, 2));
    }
}
