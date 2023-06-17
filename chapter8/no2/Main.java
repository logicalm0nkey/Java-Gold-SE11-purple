package chapter8.no2;

public class Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new ThreadA());
        Thread threadB = new Thread(new ThreadB());

        threadA.start();
        threadB.start();
    }
}

class ThreadA implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("A: " + i + " ");
        }
    }
}

class ThreadB implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("B: " + i + " ");
        }
    }
}