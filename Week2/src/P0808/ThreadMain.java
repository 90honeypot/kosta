package P0808;

import java.awt.Frame;

class MyFrame extends Frame implements Runnable {

    @Override
    public void run() { // thread에서 할 작업 구현
        int i;
        for (i = 1; i < 11; i++) {
            this.setTitle("frame title: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class ThreadMain {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(200, 200); // 윈도우창 가로, 세로 크기 (width, height)
        mf.setVisible(true); // 보이게할래?말래?
        Thread th = new Thread(mf);
        th.run();
    }
}
