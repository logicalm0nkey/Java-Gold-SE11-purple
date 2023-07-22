package chapter9.no30;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("./chapter9/no28/ren/9_XX");

        try {
            // list() は、指定されたディレクトリのみ検索する
            Files.list(path).forEach(System.out::println);
            System.out.println("-----files-----");
            Files.list(path).filter(s -> !Files.isDirectory(s)).forEach(System.out::println);
            System.out.println("-----directories-----");
            Files.list(path).filter(s -> Files.isDirectory(s)).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
