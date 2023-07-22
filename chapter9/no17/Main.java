package chapter9.no17;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("./chapter9/no17/data.txt");

        System.out.format("toString: %s%n", path.toString());
        System.out.format("normalize: %s%n", path.normalize());
        System.out.format("toUri: %s%n", path.toUri());
        System.out.format("isAbsolute: %s%n", path.isAbsolute());
        System.out.format("toAbsolutePath: %s%n", path.toAbsolutePath());

        try {
            System.out.format("toRealPath: %s%n", path.toRealPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
