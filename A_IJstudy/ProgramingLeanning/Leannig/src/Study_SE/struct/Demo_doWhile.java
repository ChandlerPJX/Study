package Study_SE.struct;

import java.util.Scanner;

public class Demo_doWhile {

    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        do {
        //里面的代码至少执行一次.
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println(sum);
    }
}
