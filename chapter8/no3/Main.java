package chapter8.no3;

public class Main {
    public static void main(String[] args) {
        // Runnable インタフェースは関数型インタフェースなので run() メソッドをラムダ式で実装可能。
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.print("A: " + i + " ");
            }
        }).start();

        // 匿名クラスでも実装可能
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.print("B: " + i + " ");
                }
            }
        }).start();
    }
}
