package LeetcodeDemo;

public class Demo_27 {

    static int nums[] = {3, 2, 2, 3};

    public static void main(String[] args) {
        Demo_27 de = new Demo_27();
        int len = de.removeElement(nums, 3);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        if (nums.length < 0) return -1;
        //[3,3,2,2,3] 3
        while (right < nums.length) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                ++left;
            }
            right++;
        }
        return left;
    }
}
