package LeetcodeDemo;

/*
给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。
更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。

将最终结果插入 nums 的前 k 个位置后返回 k 。


 */
public class Demo_26 {

    public static void main(String[] args) {
        Demo_26 de = new Demo_26();
        int[] nums = {1, 1, 2, 2, 4, 5, 5, 7,123,123,124,124,555,676,12312};// 输入数组

        int k = de.removeDuplicates(nums); // 调用

        System.out.println(k);
        System.out.println();
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        int fast = 1;
        int slow = 1;
        if (nums.length < 0) return -1;
        while (fast < nums.length) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }



//    public int removeDuplicates(int[] nums) {
//        int t = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i == 0 || nums[i] != nums[i - 1]){
//                t++;
//                nums[t++] = nums[i];
//            }
//        }
//        return t;
//    }


}
