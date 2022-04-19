package Study_SE.others;

import java.util.Arrays;

public class Array_Demo {

    public static void main(String[] args) {

        int[] a = {11, 22, 4, 5, 6, 67865, 12313, 12, 321};
//        System.out.println(a); // [I@72ea2f77    // 打印的是数组地址（hashcode）
//        System.out.println(Arrays.toString(a)); // 输出了数组。
//
//        int[] b = Arrays.copyOf(a, 4);// 建立一个新的数组，存储了a数组的前4个数
//        System.out.println(Arrays.toString(a));
//
//        Arrays.sort(a); // 把数组从小到大排序
//        System.out.println(Arrays.toString(a));
//
//        Arrays.fill(a, 100); // 把a 用100 填满。
//        System.out.println(Arrays.toString(a));
        int temp;
        Arrays.sort(a);  // quickSort
        System.out.println(Arrays.toString(a));
        temp = Arrays.binarySearch(a, 11); // 对于排序好的数组用二分法查找

        System.out.println(temp);
    }
}
