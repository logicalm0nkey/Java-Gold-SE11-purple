package chapter9.no29;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("./chapter9/no28/ren");

        try {
            Files.walk(path).filter(s -> s.toString().endsWith(".png")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
