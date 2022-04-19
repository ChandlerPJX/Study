
package LeetcodeDemo;

import java.util.Scanner;

public class Demo01 {

/*
    大家都知道斐波那契数列，现在要求输入一个正整数 n ，请你输出斐波那契数列的第 n 项。
    斐波那契数列是一个满足 fib(x)=\left\{ \begin{array}{rcl} 1
    & {x=1,2}\\ fib(x-1)+fib(x-2) &{x>2}\\ \end{array} \right.fib(x)={
    1
    fib(x−1)+fib(x−2)
    ​

    x=1,2
    x>2
    ​
      的数列
    数据范围：1\leq n\leq 401≤n≤40
    要求：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n) ，本题也有时间复杂度 O(logn)O(logn) 的解法
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("please input a number of Fibonacci  : ");
        int n = sc.nextInt();

        Demo01 de = new Demo01();
        System.out.println(de.getFibonacci(n));


    }

    public int getFibonacci(int n) {
        if (n <= 1)
            return -1;

        int pre1 = 0;
        int pre2 = 1;
        int fib = 0;
        for (int i = 2; i < n; ++i) {
            fib = pre1 + pre2;
            pre1 = pre2;
            pre2 = fib;
        }

        return fib;
    }


}
