package chapter9.no14;

import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        FileSystem fileSystem = FileSystems.getDefault();
        Path path1 = fileSystem.getPath("data.txt");
        Path path2 = fileSystem.getPath("C:\\sample\\chap9\\hoge.txt");
        Path path3 = fileSystem.getPath("C:", "sample", "chap9", "hoge.txt");

        System.out.println(path1);
        System.out.println(path2);
        System.out.println(path3);
    }
}
