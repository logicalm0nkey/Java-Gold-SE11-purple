package chapter1.no26;

class Outer {
    private int num = 100;

    class A {
        public int num = 200;

        void method(int num) {
            // これは method 内のローカル変数（引数）
            num += 1;
            // これはインナークラス内のメンバ変数
            // インナークラスのメンバ変数は this キーワードで参照する
            this.num += 1;
            // これはエンクロージングクラスないのメンバ変数
            // 外側のクラスのメンバ変数は 外側のクラス名.this で参照する
            // ネストクラス内のメソッドから外側のクラスのメンバ変数にアクセスできる
            // private でもアクセス可能！
            Outer.this.num += 1;

            System.out.println("num: " + num);
            System.out.println("this.num: " + this.num);
            System.out.println("Outer.this.num: " + Outer.this.num);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new Outer().new A().method(300);
    }
}
