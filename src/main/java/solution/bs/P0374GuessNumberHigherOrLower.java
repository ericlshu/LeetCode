package solution.bs;

/**
 * Description : 猜数字大小
 * 猜数字游戏的规则如下：
 * 每轮游戏，我都会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。
 * 如果你猜错了，我会告诉你，你猜测的数字比我选出的数字是大了还是小了。
 * 你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，返回值一共有 3 种可能的情况（-1，1 或 0）：
 * <p>
 * -1：我选出的数字比你猜的数字小 pick < num
 * 1：我选出的数字比你猜的数字大 pick > num
 * 0：我选出的数字和你猜的数字一样。恭喜！你猜对了！pick == num
 * 返回我选出的数字。
 * <p>
 * 示例 1：
 * 输入：n = 10, pick = 6
 * 输出：6
 * <p>
 * 示例 2：
 * 输入：n = 1, pick = 1
 * 输出：1
 * <p>
 * 示例 3：
 * 输入：n = 2, pick = 1
 * 输出：1
 * <p>
 * 示例 4：
 * 输入：n = 2, pick = 2
 * 输出：2
 * <p>
 * 提示：
 * 1 <= n <= 231 - 1
 * 1 <= pick <= n
 *
 * @author Eric L SHU
 * @date 2022-09-12 11:42
 * @since jdk-11.0.14
 */
public class P0374GuessNumberHigherOrLower
{
    public int guessNumber_1(int n)
    {
        int left = 1, right = n;
        while (left <= right)
        {
            int mid = (left + right) >>> 1;
            int guess = guess(mid);
            if (guess == 0)
                return mid;
            else if (guess == 1)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public int guessNumber(int n)
    {
        int left = 1, right = n;
        while (left < right)
        { // 循环直至区间左右端点相同
            int mid = left + (right - left) / 2; // 防止计算时溢出
            // 答案在区间 [left, mid] 中
            if (guess(mid) <= 0)
                right = mid;
                // 答案在区间 [mid+1, right] 中
            else
                left = mid + 1;
        }
        // 此时有 left == right，区间缩为一个点，即为答案
        return left;
    }

    private int guess(int mid)
    {
        return 0;
    }
}
