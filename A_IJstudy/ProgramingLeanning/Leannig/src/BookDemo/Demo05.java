package BookDemo;

public class Demo05 {
    /*
    n元买100个鸡， 5元/大J;3/小J;1/3元/鸡 分别标记为,x,y,z 求出x,y,z
     */

    static final int N = 31232132;
    static final float J = 0.33333334f;
    public static void main(String[] args) {

        for(int x = 0; x <= 100; x++){
            for(int y = 0; y <= 100;y++){
                for(int z = 0; z <= 100; z++){
                    if(x*5 + y*3 + z*J < N && x + y + z ==100 ){
                        System.out.println(x + " " + y + " " + z);
                    }
                }
            }
        }
    }


}
