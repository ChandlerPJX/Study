package BookDemo;

import java.util.Scanner;

public class Demo10 {
    /*
    Hello World for U
     */

    public static void main(String[] args) {
        System.out.print("Please input a string : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = input.length(); // 获得长度
        int high; // 获得多少行
        int width; // 获得多少列
        high = (n + 2) / 3;
        width = (n + 2) - high * 2;
        if (n < 5) {
            System.out.print("长度不可以少于five！");
        } else {
            Demo10 de = new Demo10();
            char output[][] = de.printU(high, width, input);
            for (int i = 0; i < high; ++i) {
                for (int j = 0; j < width; ++j) {
                    System.out.print(output[i][j]);
                }
                System.out.println();
            }
        }
    }

    public char[][] printU(int high, int width, String input) {
        char[][] c;
        char a[] = input.toCharArray();
        int temp = 0;
        int temp1 = high + width - 1;
        c = new char[high][width];
        for (int i = 0; i < high; ++i) {
            for (int j = 0; j < width; ++j)
                if (j == 0) {
                    c[i][j] = a[temp];
                    ++temp;
                } else if (i == high - 1) {
                    c[i][j] = a[temp];
                    ++temp;
                } else if (j == width - 1) {
                    c[high - i - 2][j] = a[temp1];
                    ++temp1;
                } else {
                    c[i][j] = ' ';
                }
        }
        return c;
    }
}
