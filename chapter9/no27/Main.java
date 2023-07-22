package chapter9.no27;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args){
        // PC のデフォルトファイルシステムを取得
        FileSystem system = FileSystems.getDefault();
        // ルートディレクトリを全て取得。C ドライブと D ドライブを取得する。
        Iterable<Path> directories = system.getRootDirectories();

        for (Path rootDirectory : directories) {
            // C と D が表示される
            System.out.println("RootDirectories: " + rootDirectory);
        }

        Path path = Paths.get("./chapter9/no27/rem");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path p : stream) {
                System.out.println(p.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
