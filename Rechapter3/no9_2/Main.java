package Rechapter3.no9_2;

public class Main {
    public static void main(String[] args) {
        // 以下は try ブロックの定義例

        // try ブロック内で new
        // try ブロックのみの記述も可能（catch は必ず必要というわけではない）
        try (MyResource obj = new MyResource("hoge")) {
        }

        // var を使った変数宣言
        try (var obj = new MyResource("hoge")) {
        }

        // try の前で new して、 try の中に変数だけを書くのもOK
        // この場合も、try を出るときに自動で close() が呼ばれる
        MyResource resource = new MyResource("hoge");
        try (resource) {
        }

        try (MyResource obj = new MyResource("hoge")) {
            // try 文で宣言されたリソースは実質 final となるため、再割り当ては不可能
            // 以下はコンパイルエラー
            // obj = new MyResource("fuga");
        }
    }

    void foo(MyResource resource) {
        // メソッドの引数で受け取ったリソースを try の中に書くのもOK
        try (resource) {
        }

        // try-with-resources で宣言するリソースが final または実質 final である必要があるため、
        // このように再代入をするコードはコンパイルエラーとなる（メソッドの引数に再代入しているので final になっていない）
        // try (resource = new MyResource("hoge")) {            
        // }
    }
}

// 独自のリソースクラス
class MyResource implements AutoCloseable {
    private String msg;

    public MyResource(String msg) {
        this.msg = msg;
    }

    public void close() {
        System.out.println("close(): " + msg);
    }
}