package LeetcodeDemo;


import java.util.Scanner;

/*
给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。

单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。

    输入：s = "Hello World"
    输出：5
    解释：最后一个单词是“World”，长度为5
    输入：s = "   fly me   to   the moon  "
    输出：4
    解释：最后一个单词是“moon”，长度为4。
 */
public class Demo_58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s ="love have a Incredible power!  ";
        System.out.println(lengthOfLastWord(s));
        System.out.println();
        System.out.println(lengthOfLastWorld_1(s));
        System.out.println(lengthOfLastWorld_2(s));
        System.out.println(lengthOfLastWorld_3(s));
    }


    public  static int lengthOfLastWord(String s) {
        int len = 0;
        String[] arrays = s.split(" ");
        len = arrays[arrays.length-1].length();
        return len;
    }

    // 从右向左遍历，从第一个不是空格的字符开始计数，一旦开始计数，再遇到空格就结束了
    public  static int lengthOfLastWorld_1(String s){
        int end = s.length() -1;
        int count = 0;
        //找到最后不为' ' 的单词的位置并且标记。
        while (end >=0 && s.charAt(end) == ' '){
            end--;
        }
        int start = end;
        while (start >=0 &&s.charAt(start) != ' '){
            start--;
            count++;
        }
        return count;
    }

    public  static int lengthOfLastWorld_3(String s){
        int end = s.length() -1;
        int count = 0;
        //找到最后不为' ' 的单词的位置并且标记。
        while (end >=0 && s.charAt(end) == ' '){
            end--;
        }
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') start--;
        return end - start;
    }


    public  static int lengthOfLastWorld_2(String s){
        int end = s.length() -1;
        int count = 0;
        //找到最后不为' ' 的单词的位置并且标记。
        while (end >=0 && s.charAt(end) == ' '){
            end--;
        }
        while (end >=0 &&s.charAt(end) != ' '){
            end--;
            count++;
        }
        return count;
    }

}
