package chapter8.no16;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService service = null;

        try {
            service = Executors.newSingleThreadScheduledExecutor();

            // 現在日時を表示するタスク
            Runnable task = () -> System.out.println(new Date());

            // 2秒後に最初のタスクを実行。タスクが終わってから2秒後に次のタスクを実行。以下同様。
            service.scheduleWithFixedDelay(task, 2, 2, TimeUnit.SECONDS);
            // メインスレッドで10秒間停止。この間は並列処理が行われ続ける（schedule された処理が実行され続ける）
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (service != null) {
                // ExecutorService を shutdown すると、それ以降はスケジュールされたタスクが実行されなくなる
                service.shutdown();
            }
        }
    }
}
