package chapter4.no9;

import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        // offer() で Queue に要素を追加できる。追加したら true が返る。
        // 容量が足りなかったりして要素の追加ができなかった時は false が返る。
        queue.offer("1");
        queue.offer("2");

        for (var s : queue) {
            // poll() は Queue の先頭要素を取得して削除する。要素が無かったら null が返る。
            queue.poll();
        }

        // peek() で Queue の先頭要素を取得する。要素が無かったら null が返る。
        System.out.println(queue.peek());
        // element() は要素が無かったら例外が発生する。
        System.out.println(queue.element());
    }
}
