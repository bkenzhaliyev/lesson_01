package сom.gb.lesson_03.task_02;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoThread1 {
    private DemoCounter counter = new DemoCounter(0);
    Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        DemoThread1 demo = new DemoThread1();


        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        System.out.println("Начало...");
        System.out.println("Счетчик = " + demo.getCounter());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                demo.runIncrement();
            }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                demo.runDecrement();
            }
        });

        t1.start();
        t2.start();
    }

    private void runIncrement() {
        lock.lock();
        try {
            counter.increment();
        } finally {
            lock.unlock();
        }
    }

    private void runDecrement() {
        lock.lock();
        try {
            counter.decrement();
        } finally {
            lock.unlock();
        }
    }

    private int getCounter() {
        return counter.getC();
    }
}
