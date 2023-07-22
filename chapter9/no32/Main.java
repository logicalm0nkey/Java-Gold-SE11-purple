package chapter9.no32;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("./chapter9/no32/data.txt");

        try {
            System.out.println(
                Files.lines(path).filter(s -> s.startsWith("b"))
                .map(word -> word.length())
                .collect(Collectors.toList())
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
