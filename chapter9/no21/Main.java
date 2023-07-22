package chapter9.no21;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path path1 = Paths.get("./chapter9/no21/hoge");
        Path path2 = Paths.get("./chapter9/no21/hoge/fuga/uoooo");
        try {
            // 指定されたディレクトリを作成
            // 指定されたディレクトリが既に存在する場合は FileAlreadyExistsException が発生する（実行時例外）
            Files.createDirectory(path1);
            // 指定されたディレクトリを作成。中間のディレクトリが無い場合は自動で作成してくれる。
            // こちらはディレクトリが既に存在している場合でも例外は発生しない
            Files.createDirectories(path2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            // 以下2つは、指定したディレクトリの中身が空っぽでないと例外が発生する。
            // これは例外が発生する。 hoge ディレクトリの中に fuga ディレクトリが存在するため。
            Files.delete(path1);
            // これはそもそも piyo ディレクトリが存在しないので delete が実行されず、例外が発生しない
            Files.deleteIfExists(Paths.get("./chapter21/no21/piyo"));
            // これは例外が発生しない（uooo ディレクトリの中身が空っぽのため）
            // Files.delete(path2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
