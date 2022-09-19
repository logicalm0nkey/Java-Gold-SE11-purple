package chapter4.no19;

// クラス宣言では普通の型パラメータしか使えない
class Gen<T> {
    private T var;

    public Gen(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }
}

public class Main {
    // メンバの参照変数もワイルドカードOK
    static private Gen<?> g;

    public static void main(String[] args) {
        Integer i = Integer.parseInt(args[0]);

        if (i < 100) {
            // Integer 型の Gen を生成して print を呼び出す。
            print(new Gen<>(i));
        } else {
            // String 型の Gen を生成して print を呼び出す。
            print(new Gen<>("hoge"));
        }

        // Boolean 型の Gen
        g = new Gen<>(true);
        System.out.println(g.getVar());

        System.out.println(hoge().getVar());
    }

    // ワイルドカードの使用。
    // ワイルドカードは、メソッドの引数など、参照変数の宣言時のみ使える。
    // 「実行時に参照する型を決める」というニュアンスか。
    // オブジェクトは生成するときに型が決まらないといけない、
    // したがってコンパイルするときに型が決まらないといけないから、クラス宣言とかではワイルドカードは使えないってこと。多分。
    static void print(Gen<?> gen) {
        System.out.println(gen.getVar());
    }

    // メソッドの戻り値もワイルドカードOK
    // メソッドの戻り値は return という名の参照変数になるのでOK
    static Gen<?> hoge() {
        return new Gen<>(10.0);
    }
}
