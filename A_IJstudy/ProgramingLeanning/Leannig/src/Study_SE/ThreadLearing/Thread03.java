package Study_SE.ThreadLearing;


//实现runnable 接口 进行线程创建
public class Thread03 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(" runnable");
        }
    }

    public static void main(String[] args) {
        Thread03 t1 = new Thread03();
        Thread t = new Thread(t1);
        t.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("main");
        }


    }
}
