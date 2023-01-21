package Rechapter4.no19;

// ジェネリクスを用いたクラス
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
    public static void main(String[] args) {
        int val = Integer.parseInt(args[0]);

        if (val == 1) {
            // Integer 型の Gen を生成して print
            print(new Gen<>(100));
        } else {
            // String 型の Gen を生成して print
            print(new Gen<>("hoge"));
        }
    }

    // ワイルドカードを用いたメソッド
    // Gen の型パラメータの型は実行時に判定される
    static void print(Gen<?> obj) {
        System.out.println(obj.getVar());
    }
}
