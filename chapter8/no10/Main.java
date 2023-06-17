package chapter8.no10;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        new Thread(() -> {
            // ArrayList のイテレーターを取得
            Iterator<String> iterator = list.iterator();

            // 要素がある限り、 出力 -> 5秒スリープ を繰り返す
            while (iterator.hasNext()) {
                System.out.println("Thread: " + iterator.next());

                try {
                    // 気持ちとしては、なんか重たい処理をやってる感じ
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // スリープしている間（重い処理をこなしてる間）にメインスレッドで要素数が変更されるので、次の処理で例外が発生する
            }
        }).start();

        // 上記のスレッドを開始させたのち、メインスレッドを1秒停止
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // メインスレッドで要素追加
        list.add("E");
        System.out.println("main: add()");
        // メインスレッドで要素削除
        list.remove(2);
        System.out.println("main: remove()");
    }
}
