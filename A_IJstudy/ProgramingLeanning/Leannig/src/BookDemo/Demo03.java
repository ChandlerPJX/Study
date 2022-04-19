package BookDemo;

public class Demo03 {

    /*
        打印不超过256，其平方具有对称性质的数。 如 2和11， 2*2 = 4， 11*11 = 121
     */

    public static void main(String[] args) {

        GetNumbers Demo = new GetNumbers();
        for(int i = 1; i <=256; i++){
            int n = i*i;
            if(n == Demo.getReverse(n)){
                System.out.println(n);
            }
        }

        System.out.println("------------------------");

        GetNumbers nub = new GetNumbers();

        for(int j = 1; j < 256; j++){
            int n = j*j;
            int a = nub.getWan(n);
            int b = nub.getQian(n);
            int c = nub.getBai(n);
            int d = nub.getShi(n);
            int e = nub.getGe(n);
            if(a == 0){
                if(b == 0){
                    if(c==0){
                        if(d == 0){
                            System.out.println(n);
                        }
                    }else{
                        if(c==e){
                            System.out.println(n);
                        }
                    }
                }else {
                    if(b == e && c == d){
                        System.out.println(n);
                    }
                }
            } else{
                if(a == e && b == d){
                    System.out.println(n);
                }
            }
        }
    }
}
