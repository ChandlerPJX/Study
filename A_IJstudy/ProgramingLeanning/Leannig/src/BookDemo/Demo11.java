package BookDemo;

import java.util.Scanner;

public class Demo11 {
    /*
     输入年月日，计算该天是本年第几天
     31 : 1,3,5,7,8,10,12
     30 : 4,6,9,11
     28/29: 2
     */
    public static void main(String[] args) {
        int year;
        int month;
        int days;
        Scanner sc = new Scanner(System.in);
        System.out.print("please input year:");
        year = sc.nextInt();
        System.out.print("please input moth:");
        month = sc.nextInt();
        System.out.print("please input day:");
        days = sc.nextInt();
        Demo11 de = new Demo11();
        System.out.println("the day is :" + de.getDay(year, month, days));
        System.out.println(de.isLeapYear(year));
        System.out.println("--------------- Answer from book -------------");

        de.getDays(year,month,days);
        System.out.println("the day is :" + de.getDays(year, month, days));
    }

    public int getDays(int year, int month, int days) {
        int[][] daytable = {{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
        int number = 0;
        int row;
        if (isLeapYear(year)) row = 1;
        else row = 0;
        for (int j = 0; j < month; j++) {
            number += daytable[row][j];
        }
        number += days;
        return number;

    }

    /*
        获取某年某月某日的总天数
                                                31 : 1,3,5,7,8,10,12
                                                30 : 4,6,9,11
                                                28/29: 2
     */
    public int getDay(int year, int month, int days) {

        Demo11 de = new Demo11();
        int day;
        int two;
        if (de.isLeapYear(year)) two = 29;
        else two = 28;
        month = month - 1;
        if (month <= 6) {
            if (month <= 1) {
                day = month * 31 + days;
            } else if (month % 2 == 0) {
                day = (month / 2 - 1) * 30 + month / 2 * 31 + two + days;
            } else {
                day = ((month - 1) / 2 + 1) * 31 + (month / 2 - 1) * 30 + two + days;
            }
        } else {
            if (month % 2 == 0) {
                day = (month / 2 + 1) * 31 + two + (month - month / 2 - 2) * 30 + days;
            } else {
                day = (month / 2 - 1) * 30 + two + (month / 2 + 1) * 31 + days;
            }
        }

        return day;
    }

    /*
         判断是否为瑞年
     */
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
