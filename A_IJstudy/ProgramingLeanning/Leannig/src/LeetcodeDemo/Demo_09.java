package LeetcodeDemo;

import BookDemo.GetNumbers;

import java.util.Scanner;

/*
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。
 
示例 1：

输入：x = 121
输出：true

示例 2：
输入：x = -121
输出：false
解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

 */
public class Demo_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Demo_09 de = new Demo_09();
        System.out.println(de.isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        int temp ;
        GetNumbers getNumbers = new GetNumbers();
        temp = getNumbers.getReverse(x);
        return (temp == x);
    }
}





















