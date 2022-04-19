package src;

public class Demo03 {
    /*
      强制类型转换
      低------------------------> 高
      byte,short,char -> int -> long -> float -> double

      低转高为自动转换 不需要强制类型
      高转低 需要强制转换
     */
    public static void main(String[] args) {

        int i =10_0000_0000;
        byte b = (byte) i;  //会溢出 ， 强制转换时要注意溢出问题！

        System.out.println(i);
        System.out.println(b);
        System.out.println("---------------------------------------");

        int money = 10_0000_0000; // jdk7 之后可以在数据之间加上 _ 方便阅读数据
        int year = 20;
        int total = money*year;
        //会有溢出，导致计算不准确
        System.out.println(total);

        // 修改方法
        long total1 = money*((long)year);
        System.out.println(total1);

    }

}
