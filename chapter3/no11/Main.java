package chapter3.no11;

class Test {
    private int check(int point) {
        // 引数が正数であることを期待したメソッドなので、ここにアサーションを書く。
        assert (point > 0) : point + " は不正な値です。";

        return point * 100;
    }

    int method(int point) {
        return check(point);
    }
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.method(100));
        System.out.println(test.method(-1));
    }
}
