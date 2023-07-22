package chapter9.no28;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("./chapter9/no28/ren");

        try {
            // walk() は、指定されたディレクトリ以下を全て検索する
            Files.walk(path).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
