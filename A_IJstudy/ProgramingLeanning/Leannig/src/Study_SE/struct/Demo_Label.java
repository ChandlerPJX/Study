package Study_SE.struct;

public class Demo_Label {

    //标签， label ： 类似于goto
    public static void main(String[] args) {
        int count = 0;
        outer:
        for (int i = 101; i < 150; ++i) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.println(i);
        }
    }
}
