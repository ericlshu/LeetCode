package com.eric.solution.tree;

import com.eric.domain.Node;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Description : 填充每个节点的下一个右侧节点指针
 * 给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 *
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * 初始状态下，所有 next 指针都被设置为 NULL。
 *
 * 示例 1：
 * 输入：root = [1,2,3,4,5,6,7]
 * 输出：[1,#,2,3,#,4,5,6,7,#]
 * 解释：给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。
 * 序列化的输出按层序遍历排列，同一层节点由 next 指针连接，'#' 标志着每一层的结束。
 *
 * 示例 2:
 * 输入：root = []
 * 输出：[]
 *
 * 提示：
 * 树中节点的数量在 [0, 212 - 1] 范围内
 * -1000 <= node.val <= 1000
 *
 * 进阶：
 * -> 你只能使用常量级额外空间。
 * -> 使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。
 *
 * @author Eric L SHU
 * @date 2020-10-15 22:48
 * @since JDK 1.8
 */
public class P0116PopulatingNextRightPointersInEachNode
{
    public Node connect_bfs_1(Node root)
    {
        if (root == null)
            return null;

        // 初始化队列同时将第一层节点加入队列中，即根节点
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // 外层的 while 循环迭代的是层数
        while (!queue.isEmpty())
        {
            // 记录当前队列大小
            int size = queue.size();

            // 遍历这一层的所有节点
            for (int i = 0; i < size; i++)
            {
                // 从队首取出元素
                Node node = queue.poll();
                assert node != null;
                // 连接
                if (i < size - 1)
                    node.next = queue.peek();
                // 拓展下一层节点
                if (node.left != null && node.right != null)
                {
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }
        // 返回根节点
        return root;
    }

    public Node connect_bfs_2(Node root)
    {
        if (root == null)
            return null;
        // 从根节点开始
        Node leftmost = root;

        while (leftmost.left != null)
        {
            // 遍历这一层节点组织成的链表，为下一层的节点更新 next 指针
            Node head = leftmost;
            while (head != null)
            {
                // CONNECTION 1
                head.left.next = head.right;
                // CONNECTION 2
                if (head.next != null)
                    head.right.next = head.next.left;
                // 指针向后移动
                head = head.next;
            }
            // 去下一层的最左的节点
            leftmost = leftmost.left;
        }
        return root;
    }

    public Node connect_dfs(Node root)
    {
        if (root == null)
            return null;
        if (root.left != null)
        {
            root.left.next = root.right;
            root.right.next = root.next != null ? root.next.left : null;
            connect_dfs(root.left);
            connect_dfs(root.right);
        }
        return root;
    }
}
