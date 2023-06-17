package chapter8.no13;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            // 並列処理用のシングルスレッドを準備
            service = Executors.newSingleThreadExecutor();

            // 処理を行うタスクだけを service に登録
            // 戻り値は Future オブジェクト
            Future<?> result1 = service.submit(() -> {
                try {
                    System.out.println("hello");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            // 完了するまで待機して結果を表示。結果が無いので null を表示。
            // ここで待機するから、結果が返ってくるまでメインスレッドは動かない
            System.out.println(result1.get());

            // 処理を行うタスクと、処理が完了したときの結果を登録
            // 今回は完了したときの結果として Boolean の true を設定
            Future<Boolean> result2 = service.submit(
                    // タスク
                    () -> {
                        System.out.println("hello");
                    },
                    // 完了したときの結果
                    true);
            // 完了するまで待機して結果を表示。完了した結果なので true が表示される。
            System.out.println(result2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
