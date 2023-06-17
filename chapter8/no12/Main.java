package chapter8.no12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();

            System.out.println("service.execute() " + Thread.currentThread());
            // System.out.println("service.isShutdown() " + service.isShutdown());
            System.out.println("service.isTerminated() " + service.isTerminated());

            for (int i = 0; i < 3; i++) {
                System.out.println("in for " + Thread.currentThread());
                service.execute(() -> {
                    System.out.print("thread task " + Thread.currentThread() + " ");

                    for (int a = 0; a < 5; a++) {
                        try {
                            Thread.sleep(500);
                            System.out.print(" * ");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println();
                });
            }
        } finally {
            // System.out.println("service.isShutdown() " + service.isShutdown());
            System.out.println("in finally " + Thread.currentThread());

            service.shutdown();
            // System.out.println("service.isShutdown() " + service.isShutdown());
            System.out.println("shutdown");
            System.out.println("service.isTerminated() " + service.isTerminated());
        }

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {

        }
        System.out.println("service.isTerminated() " + service.isTerminated());
    }
}
