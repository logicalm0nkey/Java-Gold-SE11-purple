package Rechapter3.no6;

public class Main {
    public static void main(String[] args) {
        try {
            method();
        } catch (MyExceptionA | MyExceptionB e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    static void method() throws MyExceptionA, MyExceptionB {
        int num = (int)(Math.random() * 10);

        try {
            if (num > 4) {
                throw new MyExceptionA();
            } else {
                throw new MyExceptionB();
            }
        } catch (Exception e) {
            throw e;
        }
    }
}

class MyExceptionA extends Exception {
    MyExceptionA() {
        super("MyExceptionA");
    }
}

class MyExceptionB extends Exception {
    MyExceptionB() {
        super("MyExceptionB");
    }
}