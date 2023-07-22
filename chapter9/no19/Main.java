package chapter9.no19;

import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path path1 = Paths.get("./X/hoge");
        Path path2 = Paths.get("./Y");

        System.out.println("X -> Y 相対パス: " + path1.relativize(path2));
        System.out.println("Y -> X 相対パス: " + path2.relativize(path1));
    }
}
