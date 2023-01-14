package solution.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Description : 复制带随机指针的链表
 * 给你一个长度为 n 的链表，每个节点包含一个额外增加的随机指针 random ，该指针可以指向链表中的任何节点或空节点。
 * 构造这个链表的 深拷贝。
 * -> 深拷贝应该正好由 n 个 全新 节点组成，其中每个新节点的值都设为其对应的原节点的值。
 * -> 新节点的 next 指针和 random 指针也都应指向复制链表中的新节点，并使原链表和复制链表中的这些指针能够表示相同的链表状态。
 * -> 复制链表中的指针都不应指向原链表中的节点 。
 * 例如，如果原链表中有 X 和 Y 两个节点，其中 X.random --> Y 。那么在复制链表中对应的两个节点 x 和 y ，同样有 x.random --> y 。
 * 返回复制链表的头节点。
 * 用一个由 n 个节点组成的链表来表示输入/输出中的链表。每个节点用一个 [val, random_index] 表示：
 * val：一个表示 Node.val 的整数。
 * random_index：随机指针指向的节点索引（范围从 0 到 n-1）；如果不指向任何节点，则为  null 。
 * 你的代码 只 接受原链表的头节点 head 作为传入参数。
 * <p>
 * 示例 1：
 * 输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
 * <p>
 * 示例 2：
 * 输入：head = [[1,1],[2,1]]
 * 输出：[[1,1],[2,1]]
 * <p>
 * 示例 3：
 * 输入：head = [[3,null],[3,0],[3,null]]
 * 输出：[[3,null],[3,0],[3,null]]
 * <p>
 * 提示：
 * -> 0 <= n <= 1000
 * -> -104 <= Node.val <= 104
 * -> Node.random 为 null 或指向链表中的节点。
 *
 * @author Eric L SHU
 * @date 2023-01-13 22:20
 * @since jdk-11.0.14
 */
public class P0138CopyListWithRandomPointer
{
    Map<Node, Node> cache = new HashMap<>();

    public Node copyRandomList_1(Node head)
    {
        if (head == null)
            return null;
        if (!cache.containsKey(head))
        {
            Node newHead = new Node(head.val);
            cache.put(head, newHead);
            newHead.next = copyRandomList_1(head.next);
            newHead.random = copyRandomList_1(head.random);
        }
        return cache.get(head);
    }

    public Node copyRandomList_2(Node head)
    {
        if (head == null)
            return null;
        Node newNode;
        for (Node node = head; node != null; node = node.next.next)
        {
            newNode = new Node(node.val);
            newNode.next = node.next;
            node.next = newNode;
        }
        for (Node node = head; node != null; node = node.next.next)
        {
            newNode = node.next;
            newNode.random = node.random != null ? node.random.next : null;
        }
        Node newHead = head.next;
        for (Node node = head; node != null; node = node.next)
        {
            newNode = node.next;
            node.next = newNode.next;
            newNode.next = newNode.next != null ? newNode.next.next : null;
        }
        return newHead;
    }

    public static class Node
    {
        private int val;
        private Node next;
        private Node random;

        public Node(int val)
        {
            this.val = val;
        }

        public Node(int val, Node next)
        {
            this.val = val;
            this.next = next;
        }

        public int getVal()
        {
            return val;
        }

        public void setVal(int val)
        {
            this.val = val;
        }

        public Node getNext()
        {
            return next;
        }

        public void setNext(Node next)
        {
            this.next = next;
        }

        public Node getRandom()
        {
            return random;
        }

        public void setRandom(Node random)
        {
            this.random = random;
        }

        @Override
        public String toString()
        {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
