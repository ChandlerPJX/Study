package LeetcodeDemo;


import java.util.Random;

/*
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
从上到下选择一条路，使得经过的数字之和最大。
路径上的每一步只能往左下或者右下走。
返回 最大值
 */
public class DP_Problem {
    public static void main(String[] args) {
        int MAX = 101;
        int n = 7;              //n表示层数
        int[][] sum = new int[MAX][MAX];   //存储数字三角形

        for (int m = 0; m < n; m++) {
            for (int k = 0; k <= m; k++) {
                sum[m][k] = new Random().nextInt(100);
                System.out.print(sum[m][k] + " ");
            }
            System.out.println();
        }
        int i = 0;
        int j = 0;
        int maxSum = getMaxSum(sum, n, i, j);
        System.out.println(maxSum);
        System.out.println(getMax(sum, n));

    }
    // n 表示层数
    /*
    7
    3 8
    8 1 0
    2 7 4 4
    4 5 2 6 5
     */

    public static int getMax(int[][] num, int n) {
        int[][] sumMax = new int[n][n];
        sumMax[0][0] = num[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                // 到达第(i,j)的路径最大值，为他上 或者左上的值; i:行 j：列
                sumMax[i][j] = Math.max(sumMax[i - 1][j], sumMax[i - 1][j - 1]) + num[i][j];
            }
        }


        System.out.println("===============");
        int max = sumMax[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                max = Math.max(sumMax[i][j], max);
                System.out.print(sumMax[i][j] + " ");
            }
            System.out.println();
        }
        return max;
    }

    // 递归解题
    /*
    可以看出每走第n行第m列时有两种后续:向下或者向右下
    由于最后一行可以确定,当做边界条件,所以我们自然而然想到递归求解
     */
    public static int getMaxSum(int[][] num, int n, int i, int j) {
        if (i == n) {
            return num[i][j];
        }
        int x = getMaxSum(num, n, i + 1, j);  // 向下走的最大值
        int y = getMaxSum(num, n, i + 1, j + 1); // 向右下的最大值
        return Math.max(x, y) + num[i][j];

    }


}

