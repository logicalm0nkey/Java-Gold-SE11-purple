package Rechapter4.no9;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        // 要素の追加
        queue.offer("1");
        queue.offer("2");

        for (String s : queue) {
            // 要素の削除
            queue.poll();
        }

        // 上のループで全要素を削除してるので peek() は null を返す
        System.out.println(queue.peek());
        // こっちは NoSuchElementException を返す
        System.out.println(queue.remove());
    }
}
