package chapter1.no11;

class Foo {
    private int num;

    public boolean equals(Object o) {
        // if ((o instanceof Foo) && (((Foo)o).num == this.num)) {
        //     return true;
        // } else {
        //     return false;
        // }
        return (o instanceof Foo) && (((Foo)o).num == this.num);
    }

    public int hashCode() {
        return this.num * 5;
    }
}

public class Main {
    public static void main(String[] args) {
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();
        System.out.println("foo1.equals(foo2) = " + foo1.equals(foo2));
    }
}
