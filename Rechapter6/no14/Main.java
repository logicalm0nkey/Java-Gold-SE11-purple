package Rechapter6.no14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10);
        List<Integer> list2 = Arrays.asList(20, 30);
        List<Integer> list3 = Arrays.asList(40, 50, 60);

        List<List<Integer>> lists = Arrays.asList(list1, list2, list3);

        // map() を使って展開
        // list の list から stream を生成（要素は list）
        lists.stream()
                // stream の要素の list から stream を生成（map() 後の stream の要素は stream）
                .map(list -> list.stream())
                // 外側の stream の各要素（stream）について、その中身を出力
                .forEach(stream -> stream.forEach(i -> System.out.print(i + " ")));

        System.out.println();
        
        // flatMap() を使って展開
        // list の list から stream を生成（要素は list）
        lists.stream()
                // stream の要素の list から stream を生成して、その stream の中身を展開
                // flatMap() 後の stream の要素は Integer
                .flatMap(list -> list.stream())
                .forEach(i -> System.out.print(i + " "));
    }
}
