package com.eric;

import com.eric.domain.NaryNode;
import com.eric.domain.Node;
import com.eric.domain.TreeNode;
import com.eric.solution.tree.*;
import org.junit.Test;
import com.eric.solution.design.P0173BSTIterator1;
import com.eric.solution.design.P0173BSTIterator2;

import java.util.List;

/**
 * Description :
 *
 * @author Eric L SHU
 * @date 2021-03-27 14:27
 * @since JDK 1.8
 */
public class TreeTest
{
    @Test
    public void testP0925()
    {
        P0925LongPressedName obj = new P0925LongPressedName();
        System.out.println("result = " + obj.isLongPressedName("saeedi", "ssaaeediixxxiii"));
    }

    static TreeNode root;

    static
    {
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node1 = new TreeNode(1, node3, node4);
        TreeNode node2 = new TreeNode(2, node5, node6);
        root = new TreeNode(0, node1, node2);
    }

    @Test
    public void test0094()
    {
        P0094BinaryTreeInorderTraversal p0094 = new P0094BinaryTreeInorderTraversal();
        System.out.println(p0094.inorderTraversalRecursion(root));
        System.out.println(p0094.inorderTraversalIteration(root));
        System.out.println(p0094.inorderTraversalMorris(root));
    }

    @Test
    public void test0144()
    {
        P0144BinaryTreePreorderTraversal p0144 = new P0144BinaryTreePreorderTraversal();
        System.out.println(p0144.preorderTraversalRecursion(root));
        System.out.println(p0144.preorderTraversalIteration(root));
        System.out.println(p0144.preorderTraversalMorris(root));
    }

    @Test
    public void test0145()
    {
        P0145BinaryTreePostorderTraversal p0145 = new P0145BinaryTreePostorderTraversal();
        System.out.println(p0145.postorderTraversalRecursion(root));
        System.out.println(p0145.postorderTraversalIteration(root));
        System.out.println(p0145.postorderTraversalMorris(root));
    }

    @Test
    public void test0102()
    {
        P0102BinaryTreeLevelOrderTraversal p0102 = new P0102BinaryTreeLevelOrderTraversal();
        List<List<Integer>> lists = p0102.levelOrderIteration(root);
        lists.forEach(System.out::println);

        lists = p0102.levelOrderRecursion(root);
        lists.forEach(System.out::println);
    }

    @Test
    public void test0104()
    {
        P0104MaximumDepthOfBinaryTree p0104 = new P0104MaximumDepthOfBinaryTree();
        System.out.println(p0104.maxDepthIteration(root));
        System.out.println(p0104.maxDepthRecursion(root));
    }

    @Test
    public void test0101()
    {
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4, null, new TreeNode(5));
        TreeNode node5 = new TreeNode(4, new TreeNode(5), null);
        TreeNode node6 = new TreeNode(3);

        TreeNode node1 = new TreeNode(2, node3, node4);
        TreeNode node2 = new TreeNode(2, node5, node6);

        TreeNode root = new TreeNode(1, node1, node2);

        P0101SymmetricTree p0101 = new P0101SymmetricTree();
        System.out.println(p0101.isSymmetricIteration1(root));
        System.out.println(p0101.isSymmetricIteration2(root));
        System.out.println(p0101.isSymmetricRecursion1(root));
        System.out.println(p0101.isSymmetricRecursion2(root));
    }

    @Test
    public void test0226()
    {
        P0144BinaryTreePreorderTraversal p0144 = new P0144BinaryTreePreorderTraversal();

        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(9);
        TreeNode node1 = new TreeNode(2, node3, node4);
        TreeNode node2 = new TreeNode(7, node5, node6);
        TreeNode root = new TreeNode(4, node1, node2);

        System.out.println(p0144.preorderTraversalRecursion(root));

        P0226InvertBinaryTree p0226 = new P0226InvertBinaryTree();

        root = p0226.invertTreeRecursion(root);
        System.out.println(p0144.preorderTraversalRecursion(root));

        root = p0226.invertTreeBFS(root);
        System.out.println(p0144.preorderTraversalRecursion(root));

        root = p0226.invertTreeDFS(root);
        System.out.println(p0144.preorderTraversalRecursion(root));
    }

    @Test
    public void test0112()
    {
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(2);
        TreeNode node8 = new TreeNode(1);

        TreeNode node3 = new TreeNode(11, node6, node7);
        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(4, null, node8);

        TreeNode node1 = new TreeNode(4, node3, null);
        TreeNode node2 = new TreeNode(8, node4, node5);

        TreeNode root = new TreeNode(5, node1, node2);

        P0112PathSum p0112 = new P0112PathSum();
        System.out.println(p0112.hasPathSumRecursion(root, 22));
        // System.out.println(p0112.hasPathSumBFS1(root, 22));
        System.out.println(p0112.hasPathSumBFS2(root, 22));
        // System.out.println(p0112.hasPathSumDFS(root, 22));
    }

    @Test
    public void test0700()
    {
        P0700SearchInABinarySearchTree p0700 = new P0700SearchInABinarySearchTree();
        TreeNode node = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode root = new TreeNode(4, node, new TreeNode(7));
        System.out.println(p0700.searchBSTRecursion(root, 5));
        System.out.println(p0700.searchBSTIteration(root, 4));
    }

    @Test
    public void test0701()
    {
        P0701InsertIntoABinarySearchTree p0701 = new P0701InsertIntoABinarySearchTree();
        TreeNode node = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode root = new TreeNode(4, node, new TreeNode(7));
        TreeNode result = p0701.insertIntoBST(root, 5);

        P0094BinaryTreeInorderTraversal p0094 = new P0094BinaryTreeInorderTraversal();
        System.out.println(p0094.inorderTraversalRecursion(result));
    }

    @Test
    public void test0653()
    {
        P0653TwoSumIVInputIsABST p0653 = new P0653TwoSumIVInputIsABST();
        TreeNode node1 = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        TreeNode node2 = new TreeNode(6, null, new TreeNode(7));
        TreeNode root = new TreeNode(5, node1, node2);
        System.out.println(p0653.findTarget_dfs_hash(root, 9));
        System.out.println(p0653.findTarget_dfs_hash(root, 28));
        System.out.println(p0653.findTarget_bfs_hash(root, 12));
        System.out.println(p0653.findTarget_dfs_pt(root, 12));
        System.out.println(p0653.findTarget_iteration_dp(root, 12));
    }

    @Test
    public void test0098()
    {
        P0098ValidateBinarySearchTree p0098 = new P0098ValidateBinarySearchTree();
        TreeNode node1 = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        TreeNode node2 = new TreeNode(6, null, new TreeNode(7));
        TreeNode root = new TreeNode(5, node1, node2);
        System.out.println(p0098.isValidBST_sort(root));
        System.out.println(p0098.isValidBST_inorder(root));
        System.out.println(p0098.isValidBST_recursion(root));
    }

    @Test
    public void test0235()
    {
        P0235LowestCommonAncestorOfABFS p0235 = new P0235LowestCommonAncestorOfABFS();
        TreeNode node4 = new TreeNode(4, new TreeNode(3), new TreeNode(5));
        TreeNode node2 = new TreeNode(2, new TreeNode(0), node4);
        TreeNode node8 = new TreeNode(8, new TreeNode(7), new TreeNode(9));
        TreeNode node6 = new TreeNode(6, node2, node8);

        System.out.println(p0235.lowestCommonAncestor_nn(node6, node2, node8));
        System.out.println(p0235.lowestCommonAncestor_n1(node6, node2, node4));
    }

    @Test
    public void test0617()
    {
        P0617MergeTwoBinaryTrees p0617 = new P0617MergeTwoBinaryTrees();
        P0144BinaryTreePreorderTraversal p0144 = new P0144BinaryTreePreorderTraversal();
        TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        System.out.println(p0144.preorderTraversalRecursion(p0617.mergeTrees_dfs(root1, root2)));
        System.out.println(p0144.preorderTraversalRecursion(p0617.mergeTrees_bfs_1(root1, root2)));
        System.out.println(p0144.preorderTraversalRecursion(p0617.mergeTrees_bfs_2(root1, root2)));
    }

    @Test
    public void test0116()
    {
        P0116PopulatingNextRightPointersInEachNode p0116 = new P0116PopulatingNextRightPointersInEachNode();

        Node node2 = new Node(2, new Node(4), new Node(5), null);
        Node node3 = new Node(3, new Node(6), new Node(7), null);
        Node node1 = new Node(3, node2, node3, null);
        node1 = p0116.connect_dfs(node1);
        System.out.println("node1 = " + node1);

        node2 = new Node(2, new Node(4), new Node(5), null);
        node3 = new Node(3, new Node(6), new Node(7), null);
        node1 = new Node(3, node2, node3, null);
        node1 = p0116.connect_bfs_1(node1);
        System.out.println("node1 = " + node1);

        node2 = new Node(2, new Node(4), new Node(5), null);
        node3 = new Node(3, new Node(6), new Node(7), null);
        node1 = new Node(3, node2, node3, null);
        node1 = p0116.connect_bfs_2(node1);
        System.out.println("node1 = " + node1);
    }

    @Test
    public void test0117()
    {
        P0117PopulatingNextRightPointersInEachNodeII p0117 = new P0117PopulatingNextRightPointersInEachNodeII();

        Node node2 = new Node(2, new Node(4), new Node(5), null);
        Node node3 = new Node(3, null, new Node(7), null);
        Node node1 = new Node(1, node2, node3, null);
        System.out.println(p0117.connect_bfs1(node1));

        node2 = new Node(2, new Node(4), new Node(5), null);
        node3 = new Node(3, null, new Node(7), null);
        node1 = new Node(1, node2, node3, null);
        System.out.println(p0117.connect_bfs2(node1));
    }

    @Test
    public void test0257()
    {
        P0257BinaryTreePaths p0257 = new P0257BinaryTreePaths();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        System.out.println(p0257.binaryTreePaths_dfs(root));
        System.out.println(p0257.binaryTreePaths_bfs(root));
    }

    @Test
    public void test0111()
    {
        P0111MinimumDepthOfBinaryTree p0111 = new P0111MinimumDepthOfBinaryTree();
        TreeNode node1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode node2 = new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
        System.out.println(p0111.minDepth_bfs(node1));
        System.out.println(p0111.minDepth_bfs(node2));
        System.out.println(p0111.minDepth_bfs(null));

        System.out.println(p0111.minDepth_dfs_1(node1));
        System.out.println(p0111.minDepth_dfs_2(node1));
        System.out.println(p0111.minDepth_dfs_3(node1));
    }

    @Test
    public void test0404()
    {
        P0404SumOfLeftLeaves p0404 = new P0404SumOfLeftLeaves();
        TreeNode node1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode node2 = new TreeNode(3);
        System.out.println(p0404.sumOfLeftLeaves_status(node1));
        System.out.println(p0404.sumOfLeftLeaves_status(node2));
        System.out.println(p0404.sumOfLeftLeaves_dfs(node1));
        System.out.println(p0404.sumOfLeftLeaves_dfs(node2));
        System.out.println(p0404.sumOfLeftLeaves_bfs(node1));
        System.out.println(p0404.sumOfLeftLeaves_bfs(node2));
    }

    private NaryNode construct()
    {
        NaryNode node7 = new NaryNode(7, List.of(new NaryNode(11, List.of(new NaryNode(14)))));
        NaryNode node8 = new NaryNode(8, List.of(new NaryNode(12)));
        NaryNode node9 = new NaryNode(9, List.of(new NaryNode(13)));

        NaryNode node6 = new NaryNode(6);
        NaryNode node10 = new NaryNode(10);

        NaryNode node3 = new NaryNode(3, List.of(node6, node7));
        NaryNode node4 = new NaryNode(4, List.of(node8));
        NaryNode node5 = new NaryNode(5, List.of(node9, node10));

        NaryNode node2 = new NaryNode(2);

        return new NaryNode(1, List.of(node2, node3, node4, node5));
    }


    @Test
    public void test0559()
    {
        P0559MaximumDepthOfNaryTree p0559 = new P0559MaximumDepthOfNaryTree();
        System.out.println(p0559.maxDepth_dfs(construct()));
        System.out.println(p0559.maxDepth_bfs(construct()));
    }

    @Test
    public void test0589()
    {
        P0589NaryTreePreorderTraversal p0589 = new P0589NaryTreePreorderTraversal();
        NaryNode root = construct();
        System.out.println(p0589.preorder_iteration(root));
        System.out.println(p0589.preorder_recursion(root));
    }

    @Test
    public void test0590()
    {
        P0590NaryTreePostorderTraversal p0590 = new P0590NaryTreePostorderTraversal();
        NaryNode root = construct();
        System.out.println(p0590.postorder_recursion(root));
        System.out.println(p0590.postorder_iteration(root));
        System.out.println(p0590.preorder_reverse(root));
    }

    @Test
    public void test0429()
    {
        P0429NaryTreeLevelOrderTraversal p0429 = new P0429NaryTreeLevelOrderTraversal();
        System.out.println(p0429.levelOrder(construct()));
    }

    @Test
    public void test0108()
    {
        P0108ConvertSortedArrayToBST p0108 = new P0108ConvertSortedArrayToBST();
        int[] nums1 = {-10, -3, 0, 5, 9};
        int[] nums2 = {1, 3};
        System.out.println(p0108.sortedArrayToBST(nums1));
        System.out.println(p0108.sortedArrayToBST(nums2));
    }

    @Test
    public void test0103()
    {
        P0103BinaryTreeZigzagLevelOrderTraversal p0103 = new P0103BinaryTreeZigzagLevelOrderTraversal();
        TreeNode root = new TreeNode(3, new TreeNode(9, new TreeNode(8), new TreeNode(12)),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(p0103.zigzagLevelOrder_1(root));
        System.out.println(p0103.zigzagLevelOrder_2(root));
    }

    @Test
    public void test0199()
    {
        P0199BinaryTreeRightSideView p0199 = new P0199BinaryTreeRightSideView();
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(4)));
        System.out.println(p0199.rightSideView_bfs(root));
        System.out.println(p0199.rightSideView_dfs(root));
    }

    @Test
    public void test0113()
    {
        P0113PathSumII p0113 = new P0113PathSumII();
        TreeNode node11 = new TreeNode(11, new TreeNode(7), new TreeNode(2));
        TreeNode node4 = new TreeNode(4, new TreeNode(5), new TreeNode(1));
        TreeNode right = new TreeNode(8, new TreeNode(13), node4);
        TreeNode left = new TreeNode(4, node11, null);
        TreeNode root = new TreeNode(5, left, right);
        System.out.println(p0113.pathSum_dfs(root, 22));
        System.out.println(p0113.pathSum_bfs(root, 22));
    }

    @Test
    public void test0105()
    {
        P0105ConstructBinaryTree p0105 = new P0105ConstructBinaryTree();
        int[] preorder = {3, 9, 20, 15, 7}, inorder = {9, 3, 15, 20, 7};
        System.out.println(p0105.buildTree_recursion(preorder, inorder));
        System.out.println(p0105.buildTree_iteration(preorder, inorder));
        // System.out.println(p0105.buildTree_recursion(new int[]{1, 2}, new int[]{1, 2}));
    }

    @Test
    public void test0173()
    {
        TreeNode root = new TreeNode(7, new TreeNode(3),
                new TreeNode(15, new TreeNode(9), new TreeNode(20)));
        P0173BSTIterator1 bstIterator1 = new P0173BSTIterator1(root);
        System.out.println(bstIterator1.next());    // 返回 3
        System.out.println(bstIterator1.next());    // 返回 7
        System.out.println(bstIterator1.hasNext()); // 返回 True
        System.out.println(bstIterator1.next());    // 返回 9
        System.out.println(bstIterator1.hasNext()); // 返回 True
        System.out.println(bstIterator1.next());    // 返回 15
        System.out.println(bstIterator1.hasNext()); // 返回 True
        System.out.println(bstIterator1.next());    // 返回 20
        System.out.println(bstIterator1.hasNext()); // 返回 False

        System.out.println("-----");

        P0173BSTIterator2 bstIterator2 = new P0173BSTIterator2(root);
        System.out.println(bstIterator2.next());    // 返回 3
        System.out.println(bstIterator2.next());    // 返回 7
        System.out.println(bstIterator2.hasNext()); // 返回 True
        System.out.println(bstIterator2.next());    // 返回 9
        System.out.println(bstIterator2.hasNext()); // 返回 True
        System.out.println(bstIterator2.next());    // 返回 15
        System.out.println(bstIterator2.hasNext()); // 返回 True
        System.out.println(bstIterator2.next());    // 返回 20
        System.out.println(bstIterator2.hasNext()); // 返回 False
    }

    @Test
    public void test0230()
    {
        P0230KthSmallestElementInBST p0230 = new P0230KthSmallestElementInBST();
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(1), null),
                new TreeNode(4)), new TreeNode(6));
        System.out.println(p0230.kthSmallest_1(root, 3));
        System.out.println(p0230.kthSmallest_2(root, 3));
    }

    @Test
    public void test0450()
    {
        P0450DeleteNodeInABST p0450 = new P0450DeleteNodeInABST();
        TreeNode root = new TreeNode(8,
                new TreeNode(4,
                        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                        new TreeNode(6, new TreeNode(5), new TreeNode(7))),
                new TreeNode(12,
                        new TreeNode(10, new TreeNode(9), new TreeNode(11)),
                        new TreeNode(14, new TreeNode(13), new TreeNode(15)))
        );
        System.out.println(p0450.deleteNode_recursion(root, 3));
        System.out.println(p0450.deleteNode_iteration(root, 12));
    }

    @Test
    public void test0297()
    {
        P0297SerializeAndDeserializeBinaryTree p0297 = new P0297SerializeAndDeserializeBinaryTree();
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        String serialize = p0297.serialize(root);
        System.out.println("serialize = " + serialize);
        System.out.println(p0297.deserialize(serialize));
    }

    @Test
    public void test0236()
    {
        P0236LowestCommonAncestorOfABinaryTree p0236 = new P0236LowestCommonAncestorOfABinaryTree();
        TreeNode root = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2,
                                new TreeNode(7), new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(0), new TreeNode(8)));
        System.out.println(p0236.lowestCommonAncestor_1(root, new TreeNode(5), new TreeNode(4)));
        System.out.println(p0236.lowestCommonAncestor_2(root, new TreeNode(6), new TreeNode(4)));
        System.out.println(p0236.lowestCommonAncestor_3(root, new TreeNode(8), new TreeNode(4)));
    }

    @Test
    public void test0110()
    {
        P0110BalancedBinaryTree p0110 = new P0110BalancedBinaryTree();
        TreeNode root1 = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15), new TreeNode(7)));
        TreeNode root2 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2));

        System.out.println(p0110.isBalanced_n2(root1));
        System.out.println(p0110.isBalanced_n(root2));
    }

    @Test
    public void test1376()
    {
        P1376TimeNeededToInformAllEmployees p1376 = new P1376TimeNeededToInformAllEmployees();
        System.out.println(p1376.numOfMinutes_1(1, 0, new int[]{-1}, new int[]{0}));
        System.out.println(p1376.numOfMinutes_2(6, 2, new int[]{2, 2, -1, 2, 2, 2}, new int[]{0, 0, 1, 0, 0, 0}));
        System.out.println(p1376.numOfMinutes_1(6, 2, new int[]{2, 2, -1, 2, 3, 2}, new int[]{0, 0, 1, 2, 0, 0}));
    }

    @Test
    public void test0637()
    {
        P0637AverageOfLevelsInBinaryTree p0637 = new P0637AverageOfLevelsInBinaryTree();
        TreeNode root1 = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15), new TreeNode(7)));
        TreeNode root2 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2));
        System.out.println(p0637.averageOfLevels_bfs(root1));
        System.out.println(p0637.averageOfLevels_dfs(root1));
        System.out.println(p0637.averageOfLevels_dfs(root2));
        System.out.println(p0637.averageOfLevels_bfs(root2));
    }

    @Test
    public void test0530()
    {
        P0530MinimumAbsoluteDifferenceInBST p0530 = new P0530MinimumAbsoluteDifferenceInBST();
        TreeNode root1 = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(6));
        TreeNode root2 = new TreeNode(1,
                new TreeNode(0),
                new TreeNode(48,
                        new TreeNode(12),
                        new TreeNode(49)));
        System.out.println(p0530.getMinimumDifference(root1));
        System.out.println(p0530.getMinimumDifference(root2));
    }

    @Test
    public void test0783()
    {
        P0783MinimumDistanceBetweenBSTNodes p0783 = new P0783MinimumDistanceBetweenBSTNodes();
        TreeNode root1 = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(6));
        TreeNode root2 = new TreeNode(1,
                new TreeNode(0),
                new TreeNode(48,
                        new TreeNode(12),
                        new TreeNode(49)));
        System.out.println(p0783.minDiffInBST(root1));
        System.out.println(p0783.minDiffInBST(root2));
    }

    @Test
    public void test0572()
    {
        P0572SubtreeOfAnotherTree p0572 = new P0572SubtreeOfAnotherTree();
        TreeNode root = new TreeNode(3,
                new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(2,
                                new TreeNode(0),
                                null)),
                new TreeNode(5));

        TreeNode subRoot =
                new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(2));
        System.out.println(p0572.isSubtree(root, subRoot));
    }
}