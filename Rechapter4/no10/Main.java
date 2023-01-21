package Rechapter4.no10;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        // 先頭（インデックス0）に挿入。
        deque.push("1");
        // 先頭（インデックス0）に挿入。したがって、要素は 2, 1 の順になる。
        deque.push("2");
        // 先頭（インデックス0）に挿入。したがって、要素は 3, 2, 1 の順になる。
        deque.push("3");

        System.out.println(deque);
        // 先頭の要素を取得して削除する。したがって 3 が表示される。
        System.out.println("pop(): " + deque.pop());
        // pop() で先頭の要素が削除されたので 2, 1 となる。
        System.out.println(deque);
    }
}
