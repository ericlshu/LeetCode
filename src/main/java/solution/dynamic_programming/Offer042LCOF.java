package solution.dynamic_programming;

/**
 * Description : 连续子数组的最大和
 * <p>
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 * <p>
 * 示例1:
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * <p>
 * 提示：
 * 1 <= arr.length <= 10^5
 * -100 <= arr[i] <= 100
 * <p>
 * 注意：本题与主站 53 题相同：https://leetcode-cn.com/problems/maximum-subarray/
 *
 * @author Eric L SHU
 * @date 2022-01-23 20:47
 * @since JDK 1.8
 */
public class Offer042LCOF {

    public int maxSubArray(int[] nums)
    {
        int preSum = 0;
        int maxSum = nums[0];
        for (int num : nums)
        {
            preSum = Math.max(preSum + num, num);
            maxSum = Math.max(maxSum, preSum);
        }
        return maxSum;
    }
}
