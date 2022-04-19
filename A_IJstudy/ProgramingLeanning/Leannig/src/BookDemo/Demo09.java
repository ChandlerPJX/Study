package BookDemo;

import java.util.Scanner;

public class Demo09 {

    /*
        叠筐
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("please input n : ");
        int n =  sc.nextInt();

        System.out.print("please input center : ");
        char center = sc.next().charAt(0);

        System.out.print("please input bored : ");
        char bored = sc.next().charAt(0);

        Demo09 de = new Demo09();
        char end[][]= de.dieKuang(n,center,bored);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                System.out.print(end[i][j]);
            }
            System.out.println();
        }
    }

    public char[][] dieKuang(int n, char center, char bored){
        char a [][] = new char[n][n];
        for(int i = 0; i <= n / 2; ++i ){
            int j = n - i - 1; //   (i,j) 是每个圈左上角坐标（j,j）是右下角
            int length = n - i * 2; // 长度
            char c ;
            if((n/2 - i)%2 == 0){   //判断是第几个圈
                c = center;
            }else{
                c = bored;
            }
            for(int k = 0; k < length; ++k){
                a[i][i + k] = c;
                a[i + k][i] = c;
                a[j][j - k] = c;
                a[j - k ][j] = c;
                }
            }
        if(n != 1){         // 把最外边的圈子 4个角去掉
            a[0][0] = ' ';
            a[0][n - 1] = ' ';
            a[n - 1][0] = ' ';
            a[n - 1][n - 1] = ' ';
        }
        return a;
    }
}
