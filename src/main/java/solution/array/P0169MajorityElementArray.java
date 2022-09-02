package solution.array;

import java.util.Arrays;

/**
 * Description : 169. 多数元素
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 示例 1：
 * 输入：nums = [3,2,3]
 * 输出：3
 * <p>
 * 示例 2：
 * 输入：nums = [2,2,1,1,1,2,2]
 * 输出：2
 * <p>
 * 提示：
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109
 * <p>
 * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 *
 * @author Eric L SHU
 * @date 2022-09-02 20:54
 * @since jdk-11.0.14
 */
public class P0169MajorityElementArray
{
    public int majorityElement(int[] nums)
    {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}