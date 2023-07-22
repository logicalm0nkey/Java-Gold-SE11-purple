package chapter9.no22;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // data.txt と data_org.txt が存在している前提のコード

        Path path1 = Paths.get("./chapter9/no22/data.txt");
        Path path2 = Paths.get("./chapter9/no22/data_cp.txt");
        Path path3 = Paths.get("./chapter9/no22/data_org.txt");
        Path path4 = Paths.get("./chapter9/no22/data_mv.txt");

        // path1 を path2 のファイル名でコピーする
        // コピーだから、処理後に path1 のファイルは残っている
        Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
        // path3 を path4 のファイル名に移動する（同じディレクトリを指定した場合は、移動でなくファイル名の変更となる）
        // 移動なので、処理後に path3 のファイルは削除される
        Files.move(path3, path4, StandardCopyOption.REPLACE_EXISTING);

        Files.delete(path1);
    }
}
