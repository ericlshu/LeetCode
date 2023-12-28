package com.eric.solution.tree;

import com.eric.domain.TreeNode;

import java.util.Arrays;

/*
 * 从中序与后序遍历序列构造二叉树
 * 给定两个整数数组 inorder 和 postorder ，其中 inorder 是二叉树的中序遍历， postorder 是同一棵树的后序遍历，请你构造并返回这颗 二叉树 。
 *
 * 示例 1:
 * 输入：inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
 * 输出：[3,9,20,null,null,15,7]
 *
 * 示例 2:
 * 输入：inorder = [-1], postorder = [-1]
 * 输出：[-1]
 *
 * 提示:
 * -> 1 <= inorder.length <= 3000
 * -> postorder.length == inorder.length
 * -> -3000 <= inorder[i], postorder[i] <= 3000
 * -> inorder 和 postorder 都由 不同 的值组成
 * -> postorder 中每一个值都在 inorder 中
 * -> inorder 保证是树的中序遍历
 * -> postorder 保证是树的后序遍历
 */
public class P0106ConstructBinaryTree
{
    public TreeNode buildTree(int[] inorder, int[] postorder)
    {
        int n = postorder.length;
        if (n == 0)
        {
            return null;
        }
        int value = postorder[n - 1];
        TreeNode root = new TreeNode(value);

        for (int i = 0; i < n; i++)
        {
            if (inorder[i] == value)
            {
                int[] inLeft = Arrays.copyOfRange(inorder, 0, i);
                int[] inRight = Arrays.copyOfRange(inorder, i + 1, n);

                int[] postLeft = Arrays.copyOfRange(postorder, 0, i);
                int[] postRight = Arrays.copyOfRange(postorder, i, n - 1);

                root.left = buildTree(inLeft, postLeft);
                root.right = buildTree(inRight, postRight);
                break;
            }
        }
        return root;
    }
}