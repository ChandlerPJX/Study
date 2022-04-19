package BookDemo;

import java.util.Scanner;

public class Demo07 {
    /*
     输出梯形
     输入一高度h（1 < h < 1000），输出一个高度为h的梯形
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please input h:");
        int h =  sc.nextInt();
        for(int i = 0; i < h; ++i){
            int j = h + i*2;
            int space = 0 ;
                space= (h - i - 1)*2  ;
            while(j > 0){
                while(space > 0){
                    System.out.print(" ");
                    --space;
                }
                System.out.print("*");
                j--;
            }
            System.out.println();
        }

        System.out.println("------Answer from book -----------------");

        int row = h;    //行数为h
        int col = h + (h - 1) * 2; // 列数为最底层的*数量
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < col; ++j){
                if(j < col - (h + 2 * i)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
