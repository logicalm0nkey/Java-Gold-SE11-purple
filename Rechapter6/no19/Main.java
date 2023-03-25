package Rechapter6.no19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("naoki", "akko", "ami");
        // Collectors.toList() を使って、 String を List<String> に変換する Collector オブジェクトを作成
        // stream の要素（String） -> collect() -> Collector オブジェクトで List<String> の要素へ
        List<String> list1 = stream1.collect(Collectors.toList());
        System.out.println(list1);

        Stream<String> stream2 = Stream.of("naoki", "akko", "ami");
        // Collectors.joining() を使って Stream の要素を文字列として連結
        // 引数はセパレータ
        String result2 = stream2.collect(Collectors.joining(" | "));
        System.out.println(result2);

        Stream<String> stream3 = Stream.of("naoki", "akko", "ami");
        // Collectors.summingInt() を使って、Integer 型の合計値を算出
        // stream の要素（String） -> collect() -> collect() の中で Collector オブジェクトに String を渡す
        // -> length() 取得 -> 合計を算出（Integer の合計なので戻り値も Integer）
        Integer result3 = stream3.collect(Collectors.summingInt(s -> s.length()));
        System.out.println(result3);

        // Double 型の戻り値が欲しいなら summingDouble()
        Stream<String> stream3_2 = Stream.of("naoki", "akko", "ami");
        Double result3_2 = stream3_2.collect(Collectors.summingDouble(s -> s.length()));
        System.out.println(result3_2);

        Stream<String> stream4 = Stream.of("naoki", "akko", "ami");
        // Collectors.averagingInt() を使って、 Integer 型の平均値を算出
        // 戻り値は Double
        Double result4 = stream4.collect(Collectors.averagingInt(s -> s.length()));
        System.out.println(result4);
    }
}
