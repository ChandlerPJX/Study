package LeetcodeDemo;

import java.util.Scanner;

public class Demo_70 {

/*
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("There are " + climbStairs(n) + " ways to climb to the top.");
        scanner.close();
    }

    /*  动态规划
        这一题可以拆分为第一次走1步，第一次走两步。地推公式如下：
        第 i 次 应该为 i-1 与 i-2的总和。
        dp[i] = dp[i-1] + dp[i-2];
     */
    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        int ways = dp[0];

        for (int i = 0; i < n; i++) {
            ways = Math.max(ways, dp[i]);
        }
        return ways;

    }

}
