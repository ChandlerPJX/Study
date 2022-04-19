package Study_SE.Scanner;

import java.util.Scanner;

// 输入多个数字，求其总和与平均数
//  每输入一个数据用回车确认，通过输入非数据结束。
 public class  Demo_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0; // 计算和
        int m = 0;  //记录多少个数字
        while (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            m++;
            sum = sum + x;
        }

        System.out.println(m + "个和为：" + sum);
        System.out.println(m + "个和的平均数为：" + (sum / m));
        sc.close();
    }
}
