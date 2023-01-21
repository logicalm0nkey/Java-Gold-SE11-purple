package Rechapter4.no15;

public class Main {
    public static void main(String[] args) {
        Gen<String> gen1 = new Gen<>("hoge");
        System.out.println(gen1.getVar1());
        gen1.setVar1("null");
        System.out.println(gen1.getVar1());

        Gen<Integer> gen2 = new Gen<>(1);
        System.out.println(gen2.getVar1());
        gen2.setVar1(2);
        System.out.println(gen2.getVar1());
    }
}

class Gen<T> {
    private T var1;
    // 型パラメータを static メンバに使用することはできない。コンパイルエラー。
    //private static T var2;

    // コンストラクタの引数で使用可能
    public Gen(T var1) {
        this.var1 = var1;
    }

    // メソッドの戻り値で使用可能
    public T getVar1() {
        return var1;
    }

    // メソッドの引数で使用可能
    public void setVar1(T var1) {
        this.var1 = var1;
    }
}