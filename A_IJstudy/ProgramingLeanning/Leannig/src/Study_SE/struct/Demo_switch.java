package Study_SE.struct;

import java.util.Scanner;

public class Demo_switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 切记 用case的时候 要加上break， 防止穿透现象
        switch (sc.nextLine()) {
            case "A":
                System.out.println("90 - 100");
                break;
            case "B":
                System.out.println(" 80 - 90");
                break;
            case "C":
                System.out.println("70 - 80");
                break;
            case "D":
                System.out.println("0- 70");
                break;
            default:
                System.out.println("what hell you doing");

        }
        sc.close();
    }
}
