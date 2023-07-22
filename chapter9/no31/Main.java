package chapter9.no31;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("./chapter9/no28/ren");

        try {
            // attr を使った条件は略
            // path から 10 階層まで、指定された条件を満たす Path の Stream を返す。
            Files.find(path, 10, (path2, attr) -> path2.toString().endsWith(".png"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
