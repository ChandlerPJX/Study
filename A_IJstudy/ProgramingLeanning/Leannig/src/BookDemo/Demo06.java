package BookDemo;

public class Demo06 {
    /*
    火鸡价格问题
     */
    static final int X = 2;
    static final int Y = 5;
    static final int Z = 6;
    static final int N = 86;

    public static void main(String[] args) {

        GetNumbers number = new GetNumbers();

        int temp = 0;
        int price1 = 0;
        for(int i = 1_2560; i <= 92569; i++){
            for(int price = 100; price < 1000; price++){
                 int a = number.getQian(i);
                 int b = number.getBai(i);
                 int c = number.getShi(i);
                if(i %price == 0 && i / price == N
                    && a == X && b == Y && c == Z){
                    temp = i;
                    price1 = price;
                }
            }
        }

        System.out.println(temp);
        System.out.println(price1);
    }
}
