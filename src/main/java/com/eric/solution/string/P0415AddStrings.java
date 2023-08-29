package com.eric.solution.string;

/**
 * Description : 字符串相加
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。
 * 你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。
 * <p>
 * 示例 1：
 * 输入：num1 = "11", num2 = "123"
 * 输出："134"
 * <p>
 * 示例 2：
 * 输入：num1 = "456", num2 = "77"
 * 输出："533"
 * <p>
 * 示例 3：
 * 输入：num1 = "0", num2 = "0"
 * 输出："0"
 * <p>
 * 提示：
 * -> 1 <= num1.length, num2.length <= 104
 * -> num1 和num2 都只包含数字 0-9
 * -> num1 和num2 都不包含任何前导零
 *
 * @author Eric L SHU
 * @date 2022-10-16 13:13
 * @since jdk-11.0.14
 */
public class P0415AddStrings
{
    public String addStrings(String num1, String num2)
    {
        if (num1.length() < num2.length())
            return addStrings(num2, num1);
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        StringBuilder res = new StringBuilder();
        while (i >= 0)
        {
            int sum = (num1.charAt(i--) - '0') + (j >= 0 ? (num2.charAt(j--) - '0') : 0) + carry;
            res.insert(0, sum % 10);
            carry = sum / 10;
        }
        if (carry == 1)
            res.insert(0, 1);
        return res.toString();
    }
}