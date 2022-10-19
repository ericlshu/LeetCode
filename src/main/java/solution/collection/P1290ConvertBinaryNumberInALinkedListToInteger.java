package solution.collection;

import domain.ListNode;

/**
 * Description : 二进制链表转整数
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 * <p>
 * 示例 1：
 * 输入：head = [1,0,1]
 * 输出：5
 * 解释：二进制数 (101) 转化为十进制数 (5)
 * <p>
 * 提示：
 * 链表不为空。
 * 链表的结点总数不超过 30。
 * 每个结点的值不是 0 就是 1。
 *
 * @author Eric L SHU
 * @date 2022-10-19 21:04
 * @since jdk-11.0.14
 */
public class P1290ConvertBinaryNumberInALinkedListToInteger
{
    public int getDecimalValue_1(ListNode head)
    {
        int res = 0;
        while (head != null)
        {
            res = res * 2 + head.val;
            head = head.next;
        }
        return res;
    }

    public int getDecimalValue_2(ListNode head)
    {
        StringBuilder sb = new StringBuilder();
        while (head != null)
        {
            sb.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    public int getDecimalValue_3(ListNode head)
    {
        int res = 0;
        while (head != null)
        {
            res = res << 1 | head.val;
            head = head.next;
        }
        return res;
    }
}
