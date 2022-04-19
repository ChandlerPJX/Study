package Study_SE.Scanner;

import java.util.Scanner;

public class Demo_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 从键盘接收数据
        int i = 0;
        float f = 0.0f;

        System.out.println("please input a number: ");

        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("i : " + i);
        }else {
            System.out.println("not a int!");
        }

        if(scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("f: " + f);
        }else {
            System.out.println("not a float!");
        }


        scanner.close();
    }
}
