package chapter4.no10;

import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Stack 構造を扱うメソッド。先頭に要素を追加する。
        deque.push("1");
        deque.push("2");
        deque.push("3");

        // 表示順は 3 -> 2 -> 1 。追加したのと逆順で表示される。
        // まさに、要素が後ろに向かって push されて行っている。
        System.out.println(deque);
        // pop() で末尾の要素を取得して削除する。
        System.out.println("pop(): " + deque.pop());
        System.out.println(deque);
    }
}
