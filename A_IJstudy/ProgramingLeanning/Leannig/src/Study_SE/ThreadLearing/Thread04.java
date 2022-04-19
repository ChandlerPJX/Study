package Study_SE.ThreadLearing;


// 使用多线程实现  买火车票
//多个线程操作同一个资源发现数据问题（3个人拿到了同一张票）
public class Thread04 implements Runnable {

    private int ticketNumber = 30;

    @Override
    public void run() {
        while (true) {
            if (ticketNumber <= 0) break;

            try {
                //模拟延迟
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticketNumber-- + "张票");
        }
    }

    public static void main(String[] args) {

        Thread04 ticket = new Thread04();
        new Thread(ticket, "Xiaoming").start();
        new Thread(ticket, "Liuhua").start();
        new Thread(ticket, "HuangNiu").start();

    }
}
