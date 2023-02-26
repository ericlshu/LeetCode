package solution.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Description : 格雷编码
 * n 位格雷码序列 是一个由 2n 个整数组成的序列，其中：
 * -> 每个整数都在范围 [0, 2n - 1] 内（含 0 和 2n - 1）
 * -> 第一个整数是 0
 * -> 一个整数在序列中出现 不超过一次
 * -> 每对 相邻 整数的二进制表示 恰好一位不同 ，且
 * -> 第一个 和 最后一个 整数的二进制表示 恰好一位不同
 * 给你一个整数 n ，返回任一有效的 n 位格雷码序列 。
 * <p>
 * 示例 1：
 * 输入：n = 2
 * 输出：[0,1,3,2]
 * 解释：
 * [0,1,3,2] 的二进制表示是 [00,01,11,10] 。
 * - 00 和 01 有一位不同
 * - 01 和 11 有一位不同
 * - 11 和 10 有一位不同
 * - 10 和 00 有一位不同
 * [0,2,3,1] 也是一个有效的格雷码序列，其二进制表示是 [00,10,11,01] 。
 * - 00 和 10 有一位不同
 * - 10 和 11 有一位不同
 * - 11 和 01 有一位不同
 * - 01 和 00 有一位不同
 * <p>
 * 示例 2：
 * 输入：n = 1
 * 输出：[0,1]
 * <p>
 * 提示：
 * -> 1 <= n <= 16
 *
 * @author Eric L SHU
 * @date 2023-02-26 21:20
 * @since jdk-11.0.14
 */
public class P0089GrayCode
{
    public List<Integer> grayCode_1(int n)
    {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        for (int i = 1; i <= n; i++)
        {
            int m = res.size();
            for (int j = m - 1; j >= 0; j--)
            {
                res.add(res.get(j) | (1 << (i - 1)));
            }
        }
        return res;
    }

    public List<Integer> grayCode_2(int n)
    {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++)
        {
            res.add((i >> 1) ^ i);
        }
        return res;
    }
}
