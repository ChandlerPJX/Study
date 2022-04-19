package BookDemo;
public class Demo01 {
    /*
     abc+bcc == 532 求 a,b,c
     */


    public static void main(String[] args)
    {

        for(int a = 0; a < 10; a++)
        {
            for(int b = 0; b < 10; b++)
            {
                for(int c = 0; c < 10; c++)
                {

                    if(a*100 + b*110 + c*12 == 532) {
//                        System.out.print(a + "\t");
//                        System.out.print(b + "\t");
//                        System.out.print(c + "\t\n");
                        System.out.println(a+" "+b+" "+c);
                    }
                }
            }
        }

    }

}
