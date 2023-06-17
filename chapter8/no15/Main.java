package chapter8.no15;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService service = null;

        try {
            // シングルスレッド用スケジュールタスクを用意
            service = Executors.newSingleThreadScheduledExecutor();

            // 戻り値無しのタスクを Runnable で用意
            Runnable tast1 = () -> System.out.println("task1");
            // 戻り値ありのタスクを Callable で用意
            Callable<Date> task2 = () -> new Date();

            // 3秒後に task1 を実行するようスケジュール
            ScheduledFuture<?> result1 = service.schedule(tast1, 3, TimeUnit.SECONDS);

            // 1/1000 秒後に task2 を実行するようスケジュール
            ScheduledFuture<Date> result2 = service.schedule(task2, 1, TimeUnit.MILLISECONDS);
            // task2 の結果を表示
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
