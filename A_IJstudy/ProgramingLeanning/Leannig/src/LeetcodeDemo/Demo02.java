package LeetcodeDemo;

import java.util.Scanner;

/*
## 题目描述

我们可以用 2\*1 的小矩形横着或者竖着去覆盖更大的矩形。
请问用 n 个 2\*1 的小矩形无重叠地覆盖一个 2\*n 的大矩形，总共有多少种方法？

## 解题思路
 */
public class Demo02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Demo02 de = new Demo02();
        System.out.println(de.matrixCover(n));
        System.out.println(de.rectCover(n));
    }

    /*
        枚举最后一个方块的摆放位置
        递归计算结果。
     */

    public int matrixCover(int n) {
        int result = 0;
        if (n <= 2)
            return n;

        result = matrixCover(n - 1) + matrixCover(n - 2);

        return result;
    }

    public int rectCover(int n) {
        if (n <= 2)
            return n;

        int pre2 = 1, pre1 = 2;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }


}
