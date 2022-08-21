package chapter1.test;

class Outer {
    private class Private {

    }

    protected class Prot {

    }

    public class Pub {

    }

    private static class PriStatic {

    }
}

public class Main {
    public static void main(String[] args) {
        // 他のメンバと同じく、アクセス修飾子が private のネストクラスは外部のクラスから利用不可
        // これはコンパイルエラー
        // Outer.Private pri = new Outer().new Private();

        // 当然 static だろうが private なら使えない
        // Outer.ProStatic ps = new Outer.PriStatic();

        // 他のメンバと同じく、 protected の場合、同一パッケージ内であれば、
        // 継承先のクラスではなくても使える
        // ていうか他のパッケージで継承する構文が多分ないから、実質同一パッケージ内でしか使えないのでは？
        Outer.Prot prot = new Outer().new Prot();

        // 当然 public なら使える
        Outer.Pub pub = new Outer().new Pub();
    }

    protected class MainPro {

    }

    public class MainPub {

    }
}
