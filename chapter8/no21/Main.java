package chapter8.no21;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // sequential stream の場合は逐次処理なので、要素が順番に処理される
        // 以下の処理なら、常に同じ順番で出力される
        Arrays.asList("a", "b", "c", "d", "e")
                .stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        // parallel stream の場合は並列処理なので、要素がランダムに処理される
        // 以下の処理なら、出力順序が実行時に変わる可能性がある（順序が保証されない）
        Arrays.asList("a", "b", "c", "d", "e")
                .parallelStream().forEach(s -> System.out.print(s + " "));
    }
}
