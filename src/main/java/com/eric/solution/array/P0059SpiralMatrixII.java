package com.eric.solution.array;

/**
 * Description : 螺旋矩阵 II
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 * <p>
 * 示例 1：
 * 输入：n = 3
 * 输出：[[1,2,3],[8,9,4],[7,6,5]]
 * <p>
 * 示例 2：
 * 输入：n = 1
 * 输出：[[1]]
 * <p>
 * 提示：
 * 1 <= n <= 20
 *
 * @author Eric L SHU
 * @date 2022-10-13 9:38 PM
 * @since jdk-11.0.14
 */
public class P0059SpiralMatrixII
{
    public int[][] generateMatrix(int n)
    {
        int[][] matrix = new int[n][n];
        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;
        int num = 1, end = n * n;
        while (num <= end)
        {
            for (int i = left; i <= right; i++)
                matrix[top][i] = num++;
            top++;

            for (int i = top; i <= bottom; i++)
                matrix[i][right] = num++;
            right--;

            for (int i = right; i >= left; i--)
                matrix[bottom][i] = num++;
            bottom--;

            for (int i = bottom; i >= top; i--)
                matrix[i][left] = num++;
            left++;
        }
        return matrix;
    }
}
