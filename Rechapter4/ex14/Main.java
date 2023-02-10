package Rechapter4.ex14;

import java.util.Arrays;
import java.util.Comparator;

public class Main implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s2.toLowerCase().compareTo(s1.toLowerCase());
    }

    public static void main(String[] args) {
        String[] ary = { "100", "Abc", "abc" };
        Arrays.sort(ary, new Main());
        for (String s : ary) {
            System.out.print(s + " ");
        }
    }
}
