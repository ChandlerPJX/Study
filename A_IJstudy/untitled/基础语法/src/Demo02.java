package src;

public class Demo02 {
    public static void main(String[] args) {
        /*
        * 整数扩展
        *
        * 二进制： 0b
        * 十进制：
        * 八进制： 0
        * 十六进制：0x
        * */

        int i = 10;
        int i1 = 011;   //八进制
        int i2 = 0xF10FFF;  //十六进制

        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);

        System.out.println("-------------------------------------");

        /* float         有限的离散的，存在舍入误差(约等于)，如f2 = f3
                          so,少用浮点数比较数据等；
           double
        * */
        float f1 = 0.1f;
        double d1 = 1.0/10;

        System.out.println(f1==d1);
        System.out.println(f1);
        System.out.println(d1);

        float f2 = 12312312321312312f;
        float f3 = f2 + 1;
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f2==f3);

        int a = 97;
        System.out.println((char)(a+1));




    }
}
