package chapter8.no19;

import java.util.concurrent.atomic.*;
import java.time.LocalDateTime;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IntegerTest test = new IntegerTest();

        exec(() -> test.addSyncInteger());
        exec(() -> test.addAtomicInteger());

        test.showData();
    }

    private static void exec(Runnable task) throws InterruptedException {
        ExecutorService service = null;

        try {
            // 100個のスレッド
            service = Executors.newFixedThreadPool(100);

            for (int i = 0; i < 10000; i++) {
                service.submit(task);
            }
            System.out.println("all submit " + LocalDateTime.now());

            // 次のいずれかが発生するまでメインスレッドを待機させる。今回は 2. が理由で待機が完了する。
            // 1. shutdown() を呼び出した後、登録したタスクが全て完了する
            // 2. タイムアウト時間を過ぎる
            // 3. スレッドに割り込みが発生する（今回の場合はメインスレッドに割り込みが発生したら待機終了）
            service.awaitTermination(10, TimeUnit.SECONDS);
            System.out.println("awaitTermination end " + LocalDateTime.now());
        } finally {
            if (service != null) {
                System.out.println("shutdown " + Thread.currentThread().getName());
                service.shutdown();
            }
        }
    }
}

class IntegerTest {
    private Integer syncInteger;
    private final AtomicInteger atomicInteger;

    public IntegerTest() {
        syncInteger = 0;
        // atomic 変数はコンストラクタで初期値を設定する
        atomicInteger = new AtomicInteger(0);
    }

    // synchronized を外すと 10000 にならないことがある。
    // 別々のスレッドで同じ値の変数をインクリメントしてしまい、片方のインクリメントが実質無かったことにされることがあるから。
    // スレッドAとスレッドBが、同時に syncInteger = 10 のときにインクリメントすると、
    // 両方で結果が 11 になる。本当はここで 12 になってほしいのに、ならない。
    // 後は、小さい値で上書きされることもあると思われる。
    // スレッドAが syncInteger = 9 を保持、スレッドBが syncInteger = 10 を保持したとき、
    // B -> A の順で実行されると、 syncInteger の値は10に上書きされる。本当は11とかになってほしいのにならない。
    synchronized public void addSyncInteger() {
        syncInteger++;
    }

    public void addAtomicInteger() {
        // インクリメント用のメソッド
        atomicInteger.getAndIncrement();
    }

    public void showData() {
        System.out.println("syncInteger: " + syncInteger);
        System.out.println("atomicInteger: " + atomicInteger);
    }
}