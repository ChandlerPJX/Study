package LeetcodeDemo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/*
    https://leetcode-cn.com/problems/roman-to-integer/
 */
public class Demo_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = romanToInt(s);
        System.out.println(x);

    }

    public static int romanToInt(String s) {
        int sum = 0;
        int num ;
        int preNum = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            num = getValue(s.charAt(i));
            if (preNum < num) {
                sum = sum - preNum;
            }else {
                sum = sum + preNum;
            }
            preNum = num;
        }
        sum = sum + preNum;
        return sum;
    }

    public static int getValue(char ch) {

        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
