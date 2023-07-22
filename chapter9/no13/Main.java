package chapter9.no13;

import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path path1 = Paths.get("hoge.txt");
        Path path2 = Paths.get("C:\\sample\\chap9\\hoge.txt");
        Path path3 = Paths.get("C:", "sample", "chap9", "hoge.txt");

        System.out.println(path1);
        System.out.println(path2);
        System.out.println(path3);
    }
}
