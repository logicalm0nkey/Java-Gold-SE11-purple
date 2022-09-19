package chapter4.no8;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        // add() は Queue に要素を追加する。追加したら true が返る。
        // Queue の容量が足りない時は例外が発生する。
        queue.add("1");
        queue.add("2");
        queue.add("3");
        
        System.out.println(queue);
        // element() は Queue の先頭要素を取得。要素が無かったら例外が発生。
        System.out.println("element(): " + queue.element());
        // element() は先頭要素を取得するだけで、Queue に変化はない
        System.out.println(queue);
        // remove() は Queue の先頭要素を取得して削除する。要素が無かったら例外が発生。
        System.out.println("remove(): " + queue.remove());
        // 先頭要素が消えてる
        System.out.println(queue);
    }
}
