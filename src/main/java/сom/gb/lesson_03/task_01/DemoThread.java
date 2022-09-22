package сom.gb.lesson_03.task_01;


public class DemoThread {
    private final Object monitor = new Object();    // монитор
    private final int count = 20;                   // количество итерации
    private volatile ActionPingPong action = new ActionPingPong("ping");

    public static void main(String[] args) {
        DemoThread demo = new DemoThread();

        Thread t1 = new Thread(() -> {
            demo.actionPing();
        });

        Thread t2 = new Thread(() -> {
            demo.actionPong();
        });

        t1.start();
        t2.start();
    }

    public void actionPing() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < count; i++) {
                    while (!action.getAction().equals("ping")) {
                        monitor.wait();
                    }
                    action.printAction();
                    action.actionSetPong();
                    monitor.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void actionPong() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < count; i++) {
                    while (!action.getAction().equals("pong")) {
                        monitor.wait();
                    }
                    action.printAction();
                    action.actionSetPing();
                    monitor.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
