package Study_SE.TestStuff;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        int[][] nums = new int[3][];
        // 给nums 赋值
        for (int i = 0; i < 3; i++) {
            System.out.println("输如长度: ");
            Scanner scanner = new Scanner(System.in);
            int len = scanner.nextInt();
            for (int j = 0; j < len; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        System.out.println("=================");

        for (int i = 0; i < 3; i++) {
            System.out.println("这" + i + "行的长度为" + nums[i].length);
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
//        int a = new Sum().fun(nums);
//        System.out.println(a);
    }

    public int fun(int[][] nums) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; ; j++) {
                if (nums[i][j] > 0) {
                    sum += nums[i][j];
                    count++;
                } else break;
            }
        }
        return sum / count;
    }
}
