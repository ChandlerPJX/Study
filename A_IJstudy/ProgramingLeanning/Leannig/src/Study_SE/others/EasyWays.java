package Study_SE.others;

import java.util.ArrayList;

/*
     定义一些常用的方法，如比大小，交换等
 */
public class EasyWays {


    public static void main(String[] args) {
        int[] arrylist = {1, 2, 3, 4, 5, 111, 50, 20, 5435, 90, 60, 88};
        EasyWays ew = new EasyWays();
        System.out.print("the biggest the number and index is : " + ew.getMax(arrylist) + " : " + ew.getMaxIndex(arrylist) + "\n");
        System.out.print("the second biggest the number and index is : " + ew.getSecondIndex(arrylist) + "\n");
        System.out.print("the number of 11's index is: " + ew.getIndex(arrylist, 11) + "\n");
        ew.swap(arrylist, ew.getIndex(arrylist, 11), 7);
        System.out.print("after swap the number of 11's index is: " + ew.getIndex(arrylist, 11) + "\n");

    }

    //交换数组的 i 与j
    public void swap(int[] arry, int i, int j) {
        int temp;
        temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;
    }

    // 找到特定数的下标
    public int getIndex(int[] arry, int number) {
        int index = 0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == number) {
                index = i;
            }
        }
        return index;
    }

    //找到数组第一大的数字的下标
    public int getMaxIndex(int[] arry) {
        int maxIndex = 0;
        int max = -1;

        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // 找到数组第二大数字的下标
    public int getSecondIndex(int[] arry) {
        int secIndex = -1;
        int secMax = 0;
        int max = getMax(arry);
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] < max) {
                if (arry[i] > secMax) {
                    secMax = arry[i];
                    secIndex = i;
                }
            }
        }
        return secIndex;
    }

    public int getMax(int num1, int num2) {
        int max = -1;
        if (num1 >= num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }

    public int getMax(int[] arry) {
        int max = -1;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];
            }
        }
        return max;
    }

}
