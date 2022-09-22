package сom.gb.lesson_03.task_02;

public class DemoCounter implements Runnable {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public DemoCounter(int num) {
        this.num = num;
    }

    public int getC() {
        return num;
    }

    public void increment() {
        int n = num;
        num++;
        System.out.println("++. Было = " + n + " Стало = " + num);
    }

    public void decrement() {
        int n = num;
        num--;
        System.out.println("--. Было = " + n + " Стало = " + num);
    }

    @Override
    public void run() {
        increment();
    }
}
