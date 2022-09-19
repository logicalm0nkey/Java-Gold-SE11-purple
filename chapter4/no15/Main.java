package chapter4.no15;

// ジェネリクスを用いたクラス
// 型パラメータがどこで利用可能か/不可能か見ていく
class Gen<T> {
    // メンバ変数で利用可能
    private T var1;

    // static メンバでは利用不可。コンパイルエラー。
    // private static T var2;

    // コンストラクタの引数で利用可能
    public Gen(T var1) {
        this.var1 = var1;
    }

    // メソッドの戻り値で利用可能
    public T getVar1() {
        return var1;
    }

    // メソッドの引数で利用可能
    public void setVar1(T var1) {
        this.var1 = var1;
    }
}

public class Main {
    public static void main(String[] args) {
        // String 型の Gen。ダイアモンド演算子を利用。
        Gen<String> gen1 = new Gen<>("A");
        System.out.println(gen1.getVar1());
        gen1.setVar1("B");
        System.out.println(gen1.getVar1());

        // Integer 型の Gen。
        Gen<Integer> gen2 = new Gen<>(1);
        System.out.println(gen2.getVar1());
        gen2.setVar1(2);
        System.out.println(gen2.getVar1());
    }
}
