package BookDemo;

public class Demo02 {
    /*
     N 为4位数， 他的9倍是其反序列数（1234 ---> 4321) 求N
     */

    public static void main(String[] args) {

        for(int a = 0; a < 10; a++){
            for (int b = 0; b < 10; b++){
                for (int c = 0; c < 10; c++){
                    for(int d = 0; d < 10; d++){
                        int N1 = a*1000 + b*100 + c*10 + d ;
                        int N2 = d*1000 + c*100 + b*10 + a ;
                        if(N1 * 9 == N2){
                            System.out.print(a);
                            System.out.print(b);
                            System.out.print(c);
                            System.out.println(d);
                        }
                    }
                }
            }
        }

        System.out.println("---------------------");

        // 方法二  创建一个Revx 方法 在调用
        GetNumbers D02 = new GetNumbers();
        for(int i = 1000; i <= 9999; i++){
            if(i*9 == D02.getReverse(i)){
                System.out.println(i);
            }
        }
    }

}
