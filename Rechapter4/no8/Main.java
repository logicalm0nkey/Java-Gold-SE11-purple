package Rechapter4.no8;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");

        System.out.println(queue);
        System.out.println("element(): " + queue.element());
        // element() は要素を削除しないので、ここの出力は1回目の出力と同じ
        System.out.println(queue);
        System.out.println("remove(): " + queue.remove());
        // remove() は要素を削除するので1個減った Queue が出力される
        System.out.println(queue);
    }
}
