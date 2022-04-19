package BookDemo;

import java.util.Scanner;

public class Demo12 {
    /*
        给出年份 m 和 n 天 算出是几月几号
     */
    static final int[][] DAYTABLE = {{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};

    public static void main(String[] args) {
        int year;
        int dayNumber;
        Demo12 de = new Demo12();
        Scanner sc = new Scanner(System.in);
        System.out.print("please input year: ");
        year = sc.nextInt();
        System.out.print("please input dayNumber: ");
        dayNumber = sc.nextInt();
        if(dayNumber > 365) System.out.println("WRONG INPUT OF DAYNUMBER !!!!!!");
        else de.output(year,dayNumber);

    }

    public int getMonth(int year, int dayNumber) {
        Demo11 de = new Demo11();
        int month = 0;
        int number = 0;
        int row;
        if (de.isLeapYear(year)) row = 1;
        else row = 0;
        for (int i = 0; i <= 12; i++) {
            if (number < dayNumber) {
                number += DAYTABLE[row][i];
                month = i;
            }
        }
        return month;
    }

    public int getDay(int year, int dayNumber) {
        Demo11 de = new Demo11();
        int month = 0;
        int day;
        int number = 0;
        int row;
        if (de.isLeapYear(year)) row = 1;
        else row = 0;
        for (int i = 0; i <= 12; i++) {
            if (number < dayNumber) {
                number += DAYTABLE[row][i];
                month = i;
            }
        }
        day = dayNumber - (number - DAYTABLE[row][month]);
        return day;
    }

    public String output(int year, int dayNumber) {
        // 0 代表前面补充0
        // 2 代表长度为4
        // d 代表参数为正数型
        Demo12 de = new Demo12();
        String stMonth = String.format("%02d", de.getMonth(year, dayNumber));
        String stDay = String.format("%02d", de.getDay(year, dayNumber));
        System.out.println(year + "-" + stMonth + "-" + stDay);
        String output = year + "-" + stMonth + "-" + stDay;
        return output;

    }

}
