package chapter9.no15;

import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("C:/chapter9/no9/data.txt");

        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName: %s%n", path.getName(0));
        System.out.format("getNameCount: %s%n", path.getNameCount());
        System.out.format("getRoot: %s%n", path.getRoot());

        while ((path = path.getParent()) != null) {
            System.out.println("  getParent: " + path);
        }

        Path p = Paths.get("hoge.txt");
        System.out.println("getRoot: " + p.getRoot());
    }
}
