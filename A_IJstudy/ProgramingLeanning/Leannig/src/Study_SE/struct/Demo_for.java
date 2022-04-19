package Study_SE.struct;


/*
 打印 9*9乘法表
 */
public class Demo_for {

    public static void main(String[] args) {
        System.out.println("9*9 :                   ");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + " = " + (i * j )+ "\t");
            }
            System.out.println();
        }
    }
}
