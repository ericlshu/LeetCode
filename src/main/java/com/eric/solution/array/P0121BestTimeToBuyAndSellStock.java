package com.eric.solution.array;

/**
 * Description : 买卖股票的最佳时机
 * <p>
 * 给定一个数组，它的第i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 * 注意：你不能在买入股票前卖出股票。
 * <p>
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * <p>
 * 示例 2:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 * @author Eric L SHU
 * @date 2020-11-08 20:30
 * @since JDK 1.8
 */
public class P0121BestTimeToBuyAndSellStock
{
    public int maxProfit(int[] prices)
    {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++)
        {
            for (int j = i + 1; j < prices.length; j++)
            {
                maxProfit = Math.max(prices[j] - prices[i], maxProfit);
            }
        }
        return maxProfit;
    }

    public int maxProfit_dp1(int[] prices)
    {
        int max = 0;
        // dp[i]表示截止到i，价格的最低点是多少
        int[] dp = new int[prices.length];
        dp[0] = prices[0];
        for (int i = 1; i < prices.length; i++)
        {
            dp[i] = Math.min(dp[i - 1], prices[i]);
            max = Math.max((prices[i] - dp[i]), max);
        }
        return max;
    }

    public int maxProfit_dp3(int[] prices)
    {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++)
        {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max((prices[i] - minPrice), maxProfit);
        }
        return maxProfit;
    }

    public int maxProfit_dp2(int[] prices)
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices)
        {
            if (price < minPrice)
                minPrice = price;
            else
                maxProfit = Math.max(price - minPrice, maxProfit);
        }
        return maxProfit;
    }
}
