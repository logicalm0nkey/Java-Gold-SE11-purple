package chapter8.no1;

public class Main {
    public static void main(String[] args) {
        // スレッドの作成
        Thread threadA = new ThreadA();
        Thread threadB = new ThreadB();

        // スレッドスタート
        threadA.start();
        threadB.start();
    }
}

// Thread の実装クラス
class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("A: " + i + " ");
        }
    }
}

class ThreadB extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("B: " + i + " ");
        }
    }
}