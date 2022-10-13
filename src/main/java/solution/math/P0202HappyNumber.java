package solution.math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Description : 快乐数
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * 「快乐数」 定义为：
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果这个过程 结果为 1，那么这个数就是快乐数。
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 * <p>
 * 示例 1：
 * 输入：n = 19
 * 输出：true
 * 解释：
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * <p>
 * 示例 2：
 * 输入：n = 2
 * 输出：false
 * <p>
 * 提示：
 * 1 <= n <= 231 - 1
 *
 * @author Eric L SHU
 * @date 2022-10-13 8:47 PM
 * @since jdk-11.0.14
 */
public class P0202HappyNumber
{
    public boolean isHappy_1(int n)
    {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while (n != 1)
        {
            n = getNext(n);
            if (!set.add(n))
                return false;
        }
        return true;
    }

    private int getNext(int n)
    {
        int sum = 0;
        while (n > 0)
        {
            int mod = n % 10;
            sum += mod * mod;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy_2(int n)
    {
        int slow = n, fast = getNext(n);
        while (fast != 1)
        {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
            if (slow == fast)
                return false;
        }
        return true;
    }

    private static final Set<Integer> cycleMembers = new HashSet<>(Arrays.asList(4, 16, 37, 58, 89, 145, 42, 20));

    public boolean isHappy_3(int n)
    {
        while (n != 1 && !cycleMembers.contains(n))
        {
            n = getNext(n);
        }
        return n == 1;
    }
}
