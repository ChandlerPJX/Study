package Study_SE.Tst;

public class Tset_1 {
/*
    public static void main(String[] args) {
        int count = 0;
        int divider;
        double PI = 0.0;
        for(;;count++) {
            divider = 2 * count + 1;
            if (count % 2 == 1){
                divider = -divider;
            }
            PI += 4.0/divider;
            if(PI < 3.1415927 && PI > 3.1415926){
                System.out.println(PI);
                break;
            }
        }
        System.out.println(count);
    }

 */

    public static void main(String[] rags) {
        //中 国 古 代 数 学 家 研 究 出 了 计 算 圆 周 率 最 简 单 的 办
        //法:PI=4/1-4/3+4/5-4/7+4/9-4/11+4/13-4/15+4/17......这个算式的结果会无
        //限接近于圆周率的值,我国古代数学家祖冲之计算出,圆周率在3.1415926 和
        //3.1415927 之间,请编程计算,要想得到这样的结果,他要经过多少次加减法运
        //算?
        double sum1 = 0;
        double sum = 4.0;
        int n = 0;
        while (!(sum<3.1415927&&sum>3.1415926)) {
            sum += 4/sum1;
            if (n % 2 != 0) {
                sum1 = 1-2*n;
            } else {
                sum1 = 2*n + 1;
            }
            n++;
        }
        System.out.println("n="+n);
    }
}
