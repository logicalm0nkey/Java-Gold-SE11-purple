package Rechapter4.no18;

// 型パラメータを Number 又はそのサブクラスに制限したジェネリクス
class Gen<T extends Number> {
    private T var;

    public Gen(T var) {
        this.var = var;
    }

    public void display() {
        System.out.println(var);
    }
}

public class Main {
    public static void main(String[] args) {
        // Integer extends Number なので OK
        Gen<Integer> gen1 = new Gen<>(1);
        gen1.display();

        // Double extends Number なので OK
        Gen<Double> gen2 = new Gen<>(2.0);
        gen2.display();

        // String は Number と継承関係に無いのでコンパイルエラー
        // Gen<String> gen3 = new Gen<>("hoge");
    }
}
