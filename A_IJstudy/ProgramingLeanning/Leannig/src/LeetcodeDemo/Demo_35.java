package LeetcodeDemo;

public class Demo_35 {
    /*
    给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
    如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     */


    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 9};
        int target = 7;
        Demo_35 demo_35 = new Demo_35();
        int index = demo_35.searchInsert(nums, target);

        System.out.println(index);
    }

    /*
     二分法查找
     left = 0 right = num.length;
     index = (left + right)/2
     如果 nums[index] < target
        left = index;
     如果 nums[index]  > target
        right = index;
     如果 nums[index]  = target
         return index;
     如果target不存在的话
        当  left = right 跳出
     */
    public int searchInsert(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        int mid = 0;
        while (left <= right ) {
            mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}
