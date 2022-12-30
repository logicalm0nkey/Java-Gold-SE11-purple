package Rechapter3.no5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // methodA();
            methodB();
        } catch (ArrayStoreException | IOException e) {
            System.out.println(e);
        }
    }

    static void methodA() /*throws ArrayStoreException*/ {
        // RuntimeException クラスのサブクラスは throws を書かなくてもOK
        throw new ArrayStoreException();
    }

    static void methodB() throws IOException {
        // checked 例外は throws を書かないとコンパイルエラーとなる。
        throw new IOException();
    }
}
