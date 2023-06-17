package chapter8.no8;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    // 以下は無限ループの処理なので、終わらせるときは Ctrl + C を押すこと。
    public static void main(String[] args) {
        // 要素数3の BlockingQueue
        BlockingQueue<Double> queue = new LinkedBlockingQueue<>(3);

        // キューに要素を追加するスレッド
        new Thread(() -> {
            while (true) {
                try {
                    // 要素を追加。キューが埋まっていたら2秒間だけ待機。キューが空かなかったら処理を中止する。
                    queue.offer(Math.random(), 2, TimeUnit.SECONDS);
                    // 追加後の要素数を表示
                    System.out.println("offer(): " + queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // キューの要素を取得及び削除するスレッド
        new Thread(() -> {
            while (true) {
                try {
                    // 要素を取得及び削除。キューが空なら2秒間だけ待機。キューに要素が入らなかったら処理を中止する。
                    Double num = queue.poll(2, TimeUnit.SECONDS);
                    // 取得した要素を表示。
                    System.out.println("poll(): " + num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
