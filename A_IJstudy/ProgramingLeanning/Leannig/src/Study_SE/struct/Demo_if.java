package Study_SE.struct;

import java.util.Scanner;

public class Demo_if {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("please input your world: ");
        if (sc.nextLine().equals("Hello")) {
            System.out.println("Hello sir time to sleep!");
        } else {
            System.out.println("Fuck you Damn");
        }

        sc.close();
    }

}
