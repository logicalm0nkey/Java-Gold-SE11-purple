package chapter8.no11;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

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

                // CopyOnWriteArrayList を使っているので、メインスレッドで要素の増減が行われても例外が発生しない
                // このスレッド内で参照している配列がメインスレッドと異なるものになるため
            }
        }).start();

        // 上記のスレッドを開始させたのち、メインスレッドを1秒停止
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // メインスレッドで要素追加
        // CopyOnWriteArrayList で add() すると、基の配列のコピーを作成してから要素を追加する
        list.add("E");
        System.out.println("main: add()");
        // メインスレッドで要素削除
        // remove() も add() と同様に、基の配列のコピーを作成してから要素を削除する
        list.remove(2);
        System.out.println("main: remove()");
    }
}
