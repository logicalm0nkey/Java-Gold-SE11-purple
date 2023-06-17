package chapter8.no6;

public class Main {
    public static void main(String[] args) {
        Share share = new Share();
        Thread threadA = new ThreadA(share);
        Thread threadB = new ThreadB(share);

        threadA.start();
        threadB.start();
    }
}

// マルチスレッドで共有するクラス
class Share {
    private int a = 0;
    private String b;

    // synchronized で排他制御
    public synchronized void set() {
        while (a != 0) {
            try {
                System.out.println("A start waiting");
                wait();
                System.out.println("A ends waiting");
            } catch (InterruptedException e) {

            }
        }

        System.out.println("A notifies");
        notify();
        System.out.println("A ends notifying");

        a++;
        b = "data";
        System.out.println("set() a: " + a + " b: " + b);
    }

    public synchronized void print() {
        while (b == null) {
            try {
                System.out.println("  B start waiting");
                wait();
                System.out.println("  B ends waiting");
            } catch (InterruptedException e) {

            }
        }

        System.out.println("  B notifies");
        notify();
        System.out.println("  B ends notifying");

        a--;
        b = null;
        System.out.println("  print() a: " + a + " b: " + b);
    }
}

class ThreadA extends Thread {
    private Share share;

    public ThreadA(Share share) {
        this.share = share;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            share.set();
        }
    }
}

class ThreadB extends Thread {
    private Share share;

    public ThreadB(Share share) {
        this.share = share;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            share.print();
        }
    }
}