package Study_SE.Scanner;

import java.util.Scanner;

public class Demo_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("use next to get : ");
        // 判断用户有没有输入字符串
        if (sc.hasNext()) {
            // next 不能得到带有空格的字符串（会把空格作为分隔符/结束符）
            String str = sc.next();
            System.out.println("output: " + str);
        }
        //  IO用完要记得关闭
        sc.close();
    }
}
