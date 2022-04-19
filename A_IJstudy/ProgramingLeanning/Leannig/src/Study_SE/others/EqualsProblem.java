package Study_SE.others;

import java.sql.SQLOutput;

public class EqualsProblem {


    public static void main(String[] args) {
        String a = new String("ab"); // a 为一个引用
        String b = new String("ab"); // b为另一个引用,对象的内容一样
        String aa = "ab"; // 放在常量池中
        String bb = "ab"; // 从常量池中查找
        System.out.println(aa == bb);// true
        System.out.println(a == b);// false
        // true (String 中的 equals 方法是被重写过的，因为 Object 的 equals 方法是比较的对象的内存地址
        // 而 String 的 equals 方法比较的是对象的值。
        System.out.println(a.equals(b));
        System.out.println(42 == 42.0);// true

    }
}
