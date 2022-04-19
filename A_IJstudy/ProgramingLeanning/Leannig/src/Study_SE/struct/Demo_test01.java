package Study_SE.struct;

public class Demo_test01 {
    //打印三角形

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for(int j  = 1; j <i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
