package Study_SE.struct;

public class Demo_BCG {
    // demo of break continue  goto

    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            ++i;
            if (i %10 == 0) {
                System.out.println();
                continue;
            }
            System.out.println(i);
        }
    }
}
