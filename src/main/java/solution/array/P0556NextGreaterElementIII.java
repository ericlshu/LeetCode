package solution.array;

/**
 * Description : 下一个更大元素 III
 * 给你一个正整数 n ，请你找出符合条件的最小整数，其由重新排列 n 中存在的每位数字组成，并且其值大于 n 。如果不存在这样的正整数，则返回 -1 。
 * 注意 ，返回的整数应当是一个 32 位整数 ，如果存在满足题意的答案，但不是 32 位整数 ，同样返回 -1 。
 * <p>
 * 示例 1：
 * 输入：n = 12
 * 输出：21
 * <p>
 * 示例 2：
 * 输入：n = 21
 * 输出：-1
 * <p>
 * 提示：
 * 1 <= n <= 231 - 1
 *
 * @author Eric L SHU
 * @date 2022-12-10 19:16
 * @since jdk-11.0.14
 */
public class P0556NextGreaterElementIII
{
    public int nextGreaterElement(int n)
    {
        char[] nums = Integer.toString(n).toCharArray();
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
        {
            i--;
        }
        if (i < 0)
        {
            return -1;
        }
        int j = nums.length - 1;
        while (j >= 0 && nums[i] >= nums[j])
        {
            j--;
        }
        swap(nums, i, j);
        reverse(nums, i + 1);
        long res = Long.parseLong(new String(nums));
        return res > Integer.MAX_VALUE ? -1 : (int) res;
    }

    private void reverse(char[] nums, int i)
    {
        int j = nums.length - 1;
        while (i < j)
        {
            swap(nums, i++, j--);
        }
    }

    private void swap(char[] nums, int i, int j)
    {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
