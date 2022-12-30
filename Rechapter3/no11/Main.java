package Rechapter3.no11;

class Test {
    private int check(int point) {
        assert point > 0 : point + "は不正な値です";

        return point * 100;
    }

    int method(int point) {
        return check(point);
    }
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.method(10));
        System.out.println(test.method(-1));
    }
}
