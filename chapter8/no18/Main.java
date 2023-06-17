package chapter8.no18;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            // 最大4つ分のスレッドプールを作成
            service = Executors.newFixedThreadPool(4);

            // バリアポイント (await() の箇所) で待機するスレッドは2個
            // スレッドがバリアポイントを通過する際に「task 」と出力する
            CyclicBarrier barrier = new CyclicBarrier(2, () -> System.out.println("task"));

            for (int i = 0; i < 4; i++) {
                // 
                service.execute(() -> new Main().execute(barrier));
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }

    void execute(CyclicBarrier barrier) {
        try {
            System.out.println(Thread.currentThread().getName() + " start");

            // 疑似的なタスク
            Thread.sleep((int)(Math.random() * 3000));
            // ここが待機場所。タスクが終わった後に他のスレッドを待つ。
            barrier.await();

            System.out.println(Thread.currentThread().getName() + " end");
        } catch (BrokenBarrierException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
