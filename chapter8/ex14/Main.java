package chapter8.ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // main 以外のシングルスレッドを使って並列処理
        ExecutorService service = Executors.newSingleThreadExecutor();

        try {
            List<Future<?>> list = new ArrayList<>();

            // 0 <= i < 10 の範囲で IntStream を作成
            IntStream.range(0, 10)
                    // 各要素で foo を実行するタスクを設定。結果 (Future オブジェクト) を list に突っ込む。
                    .forEach(i -> list.add(service.submit(() -> foo(i))));

            list.stream().forEach(f -> show(f));
        } finally {
            service.shutdown();
        }
    }

    static Integer foo(int num) {
        return -1;
    }

    static void show(Future<?> future) {
        try {
            System.out.print(future.get() + " ");
        } catch (Exception e) {
            System.out.print("error ");
        }
    }
}
