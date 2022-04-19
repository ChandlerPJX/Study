package Study_SE.struct;

import java.util.Scanner;

public class Demo_while {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("please input a number : ");
        int sum = 0;
        int m = sc.nextInt();
        while (m > 0) {

            sum += m;
            m--;
        }
        System.out.println("sum is :" + "\t" + sum);
        sc.close();

    }
}
