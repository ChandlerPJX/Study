package BookDemo;

public class Demo04 {
    /*
    求1～100中与7无关的数字的正整数的平方和
    能被7整除 or 十进制表示法中有7
     */

    public static void main(String[] args) {

         int sum = 0;
        for(int i = 1; i <= 100; i++){
            int a = i/100;
            int b = (i - a*100)/10;
            int c = i - a*100 - b*10;
            if(i % 7 != 0){
                if(a != 7 && b != 7 && c != 7){
                    sum += i*i;
                    System.out.print(i*i + " + ");
                }
            }
        }
        System.out.print(" = ");
        System.out.println(sum);
    }


}
