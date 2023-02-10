package Rechapter5.no6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Taro", "Hoge");
        words.replaceAll(str -> str.toUpperCase());
        System.out.println(words);
    }
}
