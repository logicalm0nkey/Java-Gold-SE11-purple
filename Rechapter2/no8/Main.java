package Rechapter2.no8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        m(new ArrayList<String>());
    }

    // SafeVarargs アノテーションを書けば、型の安全性に関する警告が出なくなる。
    @SafeVarargs
    static void m(List<String>... lists) {
        System.out.println(lists);
    }
}
