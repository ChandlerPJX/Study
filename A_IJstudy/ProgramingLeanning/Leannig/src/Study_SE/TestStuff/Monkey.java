package Study_SE.TestStuff;


/*
15个猴子围成一圈选大王,依次1-7循环报数,
报到7的猴子被淘汰,后面的猴子再从1开始数，
直到最后剩一只猴子称为大王,
问:哪只猴子会成为大王?

 */
public class Monkey {

    public static void main(String[] args) {
        Monkey mk = new Monkey();
        int[] monkeys = new int[15];
//        for (int i = 0; i < monkeys.length; i++) {
//            System.out.print(monkeys[i] + " ");
//        }
//        System.out.println();
//        System.out.println("++++++++++++++");
        mk.del(monkeys);
//        for (int i = 0; i < monkeys.length; i++) {
//            System.out.print(monkeys[i] + " ");
//        }
//        System.out.println();
//        System.out.println("++++++++++++++");
        int index = mk.findDW(monkeys);
        System.out.println("大王是：" + index);
    }

    public int findDW(int[] monkeys) {
        int index = -1;
        for (int i = 0; i < monkeys.length; i++) {
            if (monkeys[i] == 1) {
                index = i + 1;
            }
        }
        return index;
    }

    public void del(int[] monkeys) {
        int count = 1;
        int obsoleteNo = 0;
        while (obsoleteNo < 14) {
            for (int i = 0; i < monkeys.length; i++) {
                // System.out.println("monkey is ：" + monkeys[i]);
                // -1代表被淘汰
                if (monkeys[i] != -1) {
                    monkeys[i] = count;
                    if (monkeys[i] == 7) {
                        // 重制计数
                        monkeys[i] = -1;
                        count = 0;
                        // 当有-1的时候 记录淘汰数
                        obsoleteNo++;
//                        System.out.println(" 淘汰了 :" + obsoleteNo);
//                        System.out.println((i + 1) + "    被淘汰  " + monkeys[i]);
                    }
                    count++;
                }
            }
            for (int i = 0; i < monkeys.length; i++) {
//                System.out.print(monkeys[i] + " ");
            }
//            System.out.println();
//            System.out.println("========================");
        }

    }


}
