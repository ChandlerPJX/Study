package BookDemo;

import BookDemo.Demo11;
import BookDemo.Demo12;

import java.util.Scanner;

public class Demo13 {
    /*
     计算一个日期加上若干天自后是什么日期
     */
    public static void main(String[] args) {
        Demo11 de11 = new Demo11();
        Demo12 de12 = new Demo12();
        int lineNumber;
        System.out.print("please input the number of data:");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        lineNumber = Integer.parseInt(number);
        /* 或者使用这个方法：
        int num = sc.nextInt();
        sc.nextLine();
        */
        System.out.println("please int put year/month/day/plus days:");
        int days[] = new int[lineNumber];   //存放计算得到的总天数
        int[][] data = new int[lineNumber][4];
        // 按 年 月 日 增加天数 存放在一个二维数组中
        for (int i = 0; i < lineNumber; i++) {
            String st = sc.nextLine();
            String inputData[] = st.split(" ");
            for (int j = 0; j < inputData.length; j++) {
                data[i][j] = Integer.parseInt(inputData[j]);
            }
        }
        //取得总天数并进行计算与输出结果
        for (int k = 0; k < lineNumber; k++) {
            days[k] = de11.getDays(data[k][0], data[k][1], data[k][2]) + data[k][3];
            de12.output(data[k][0], days[k]);
        }
    }

}
