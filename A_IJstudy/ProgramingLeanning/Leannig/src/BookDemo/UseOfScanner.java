package BookDemo;

import java.util.Scanner;
/*
    最强获得 用户键入数据
 */

public class UseOfScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your name please:");
        String name = sc.nextLine();
        System.out.println("input your age please:");
        int age = sc.nextInt();
        System.out.println("Is this your name? " +name);
        System.out.println("Is this your age? " + age);

        // 如何获得字符
        char center = sc.next().charAt(0);
        char bored = sc.next().charAt(0);
        System.out.println( center +" "+ bored);

    }
}
