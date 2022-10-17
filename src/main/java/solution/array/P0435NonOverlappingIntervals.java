package solution.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Description : 无重叠区间
 * 给定一个区间的集合 intervals ，其中 intervals[i] = [starti, endi] 。返回 需要移除区间的最小数量，使剩余区间互不重叠 。
 * <p>
 * 示例 1:
 * 输入: intervals = [[1,2],[2,3],[3,4],[1,3]]
 * 输出: 1
 * 解释: 移除 [1,3] 后，剩下的区间没有重叠。
 * <p>
 * 示例 2:
 * 输入: intervals = [ [1,2], [1,2], [1,2] ]
 * 输出: 2
 * 解释: 你需要移除两个 [1,2] 来使剩下的区间没有重叠。
 * <p>
 * 示例 3:
 * 输入: intervals = [ [1,2], [2,3] ]
 * 输出: 0
 * 解释: 你不需要移除任何区间，因为它们已经是无重叠的了。
 * <p>
 * 提示:
 * 1 <= intervals.length <= 105
 * intervals[i].length == 2
 * -5 * 104 <= starti < endi <= 5 * 104
 *
 * @author Eric L SHU
 * @date 2022-10-17 20:20
 * @since jdk-11.0.14
 */
public class P0435NonOverlappingIntervals
{
    public int eraseOverlapIntervals_1(int[][] intervals)
    {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        int n = intervals.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; ++i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (intervals[j][1] <= intervals[i][0])
                {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return n - Arrays.stream(dp).max().getAsInt();
    }

    public int eraseOverlapIntervals_2(int[][] intervals)
    {
        if (intervals.length == 1)
            return 0;
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[1]));
        int n = intervals.length;
        int right = intervals[0][1];
        int ans = 1;
        for (int i = 1; i < n; ++i)
        {
            if (intervals[i][0] >= right)
            {
                ++ans;
                right = intervals[i][1];
            }
        }
        return n - ans;
    }
}
