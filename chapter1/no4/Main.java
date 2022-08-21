package chapter1.no4;

class Test {
    static String staticMember = "static";
    String instanceMember = "instance";
}

public class Main {
    public static void main(String[] args) {
        Test t = null;
        System.out.println(t.staticMember);
        System.out.println(t.instanceMember);
    }
}