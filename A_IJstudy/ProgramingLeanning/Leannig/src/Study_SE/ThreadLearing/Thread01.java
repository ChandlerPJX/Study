package Study_SE.ThreadLearing;


/*
    1· 继承 Thread类
    2· 重写run（）方法
    3· 调用start开启线程
 */
public class Thread01 extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {
            System.out.println("learning in run() ; " + i);
        }

    }

    public static void main(String[] args) {

        //创建一个对象
        Thread01 thread = new Thread01();
        // 调用start 方法
        thread.start();

        for (int i = 0; i < 20; i++){
            System.out.println("learning in main : " + i);
        }

    }
}
