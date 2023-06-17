package chapter8.no17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            // スレッドプールを作成
            service = Executors.newCachedThreadPool();
            // こっちは最大2個までスレッドを作成するプール
            // service = Executors.newFixedThreadPool(2);

            // タスクを用意
            Runnable task = () -> {
                String threadName = Thread.currentThread().getName();                
                System.out.println(threadName + " start");

                // 疑似的なタスク
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(threadName + " end");
            };

            // スレッドプールのスレッドを使って、5回タスクを実行
            // newCachedThreadPool でスレッドプールを作成した場合は、プール内のスレッドを使いまくれるので、スレッドが5個作成される
            // newFixedThreadPool の場合は2個のスレッドを使いまわす
            for (int i = 0; i < 5; i++) {
                service.execute(task);
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
