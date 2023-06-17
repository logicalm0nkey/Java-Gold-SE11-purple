package chapter8.no4;

public class Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            System.out.println("threadA: sleep 開始");
            try {
                // 5秒スリープ
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("threadA: 割り込みをキャッチ");
            }

            System.out.println("threadA: 処理再開");
        });

        // threadA スタート。非同期処理なので、このまま下のコードが実行される。
        threadA.start();

        try {
            System.out.println("main: sleep 開始");
            // 2秒スリープ
            Thread.sleep(2000);
            System.out.println("main: sleep 終了");
            // threadA に割り込み
            // ここではスリープ中の threadA に割り込みが発生して、threadA で InterruptedException が発生する
            threadA.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main: 割り込みをキャッチ");
        }
    }
}
