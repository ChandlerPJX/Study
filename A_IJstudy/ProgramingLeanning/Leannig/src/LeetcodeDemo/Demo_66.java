package LeetcodeDemo;

/*
给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。


 */

public class Demo_66 {

    /*
    需要考虑是否有进位
     */

    public static void main(String[] args) {
        Demo_66 demo_66 = new Demo_66();

        int[] nums = {9, 9, 9};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        int[] an = (demo_66.plusOne(nums));
        System.out.println();
        System.out.println("------------------");
        for (int i = 0; i < an.length; i++) {
            System.out.print(an[i] + " ");
        }
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        int carry = 0;
        int add = 1;
        for (int i = len; i >= 0; i--) {
            digits[i] = digits[i] + carry + add;
            carry = digits[i] / 10;
            digits[i] = digits[i] % 10;
            if (i == 0 && carry == 1) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
            }
            add = 0;
        }
        return digits;
    }
}
