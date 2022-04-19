package Study_SE.others;

import java.util.Scanner;

public class test {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number  = sc.nextInt();     //  由于调用nextInt之后（读取数据以回车或者空格隔断）
                                        // 会在缓冲池留下读取数据时留下的会车（/w）或者空格（/n）
                                        // 因此需要多调用一次nextLine方法来读取到出来。
        sc.nextLine();
        String st = sc.nextLine();
        String arrayList[] = st.split(" ");

        int num[] = new int[arrayList.length];

        for (int i = 0; i < arrayList.length; i++) {
            num[i] = Integer.parseInt(arrayList[i]);
            System.out.print(num[i] + " ");
        }
    }

}
