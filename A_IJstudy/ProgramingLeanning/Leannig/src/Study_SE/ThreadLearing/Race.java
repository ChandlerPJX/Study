package Study_SE.ThreadLearing;


// 模拟 龟兔赛跑
public class Race implements Runnable {
    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            boolean flag = gameOver(i);
            if (flag) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
//            try {
//                if (Thread.currentThread().getName().equals("兔子") && i % 12 == 0)
//                    Thread.sleep(10);
//                System.out.println("--------------兔子睡了一会---------------");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    private boolean gameOver(int staps) {
        if (winner != null) {
            return true;
        } else {
            if (staps >= 100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner is :" + winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();

        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();

    }

}
