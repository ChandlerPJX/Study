package LeetcodeDemo;

import com.sun.source.tree.BreakTree;

public class Demo_53 {

    /*
    给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），
    返回其最大和。
    子数组 是数组中的一个连续部分。

    输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
    输出：6
    解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
     */

    public static void main(String[] args) {

        int[] nums = {1, -2, 4, 1, -1, 1, -1};
    }


    /*
    动态规划问题

     */
    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        // dp[i] 表示：以 nums[i] 结尾的连续子数组的最大和
        int[] dp = new int[len];
        dp[0] = nums[0];
        //  求以i结尾的子数组的最大和 并存放在dp[i] 中
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }
        // 也可以在上面遍历的同时求出 res 的最大值，
        // 这里我们为了语义清晰分开写，大家可以自行选择
        int res = dp[0];
        for (int i = 0; i < len; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }


}
