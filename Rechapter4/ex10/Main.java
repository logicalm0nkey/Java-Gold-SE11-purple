package Rechapter4.ex10;

public class Main<T> {
    T t;

    public Main(T t) {
        this.t = t;
    }

    public String toString() {
        return t.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Main(true));
        System.out.println(new Main<>(10));
        System.out.println(new Main<String>("hoge"));
    }
}
