package P0816;

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(getName() + " : " + i + " 번째 작업");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for(char i='a'; i<='z'; i++) {
            System.out.println(getName() + " : " + i + " 번째 작업");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class MyThreadMain {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();

        th1.start();
        th2.start();
    }
}
