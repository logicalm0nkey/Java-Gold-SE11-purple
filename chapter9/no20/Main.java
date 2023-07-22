package chapter9.no20;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path path1 = Paths.get("./chapter9/no20/data.txt");
        Path path2 = Paths.get("D:\\workspace\\Java-Gold-SE11-purple\\chapter9\\no20\\data.txt");

        System.out.format("exists: %s%n", Files.exists(path1));

        try {
            // 相対パスと絶対パスの比較でも、同じファイル or ディレクトリを示していたら true が返る
            System.out.format("isSameFile: %s%n", Files.isSameFile(path1, path2));
        } catch (IOException e) {

        }

        System.out.format("isDirectory: %s%n", Files.isDirectory(path1));
        System.out.format("isRegularFile: %s%n", Files.isRegularFile(path1));
        System.out.format("isReadable: %s%n", Files.isReadable(path1));
        System.out.format("isExecutable: %s%n", Files.isExecutable(path1));
    }
}
