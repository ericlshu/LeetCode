package solution.dp;

/**
 * Description : 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * <p>
 * 示例 1：
 * 输入：[1,2,3,1]
 * 输出：4
 * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 * <p>
 * 示例 2：
 * 输入：[2,7,9,3,1]
 * 输出：12
 * 解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 * 偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * <p>
 * 提示：
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 *
 * @author Eric L SHU
 * @date 2022-09-24 10:24
 * @since jdk-11.0.14
 */
public class P0198HouseRobber
{
    public int rob_1(int[] nums)
    {
        int len = nums.length;
        if (len == 1)
            return nums[0];
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < len; i++)
        {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[len - 1];
    }

    public int rob_2(int[] nums)
    {
        int len = nums.length;
        if (len == 1)
            return nums[0];
        int prev = nums[0];
        int curr = Math.max(nums[1], nums[0]);
        int temp;
        for (int i = 2; i < len; i++)
        {
            temp = curr;
            curr = Math.max(nums[i] + prev, curr);
            prev = temp;
        }
        return curr;
    }
}
