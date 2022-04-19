package Study_SE.Scanner;

import java.util.Scanner;

public class Demo_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("use nextLine to get : ");
        if(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println("output:" + str);
        }
        sc.close();
    }
}
