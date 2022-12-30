package Rechapter3.no8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Main {

}

class Super {
    void method() throws IOException {
    }
}

class SubA extends Super {
    // サブクラスでオーバーライドしたメソッドでは、親クラスのメソッドの例外を throws に書かなくてもOK
    void method() {
    }
}

class SubB extends Super {
    // 親クラスのメソッドで throws される例外のサブクラスを throws に書ける
    void method() throws FileNotFoundException {
    }
}

class SubC extends Super {
    // RuntimeException はいつでも throws に書ける
    void method() throws RuntimeException {
    }
}

class SubD extends Super {
    // 親クラスのメソッドで throws される例外の子クラスでないとコンパイルエラーとなる。
    // Exception は IOException の親クラスなのでコンパイルエラー
    // void method() throws Exception {
    // }
}

class SubE extends Super {
    // 親クラスのメソッドで throws される例外の子クラスでないとコンパイルエラーとなる。
    // SQLException は IOException と継承関係いないのでコンパイルエラー
    // void method() throws SQLException {
    // }
}