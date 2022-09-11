import domain.ListNode;
import org.junit.Test;
import solution.linked_list.P0143ReorderList;
import solution.linked_list.P0203RemoveLinkedListElements;
import solution.linked_list.P0206ReverseLinkedList;

/**
 * Description :
 *
 * @author Eric L SHU
 * @date 2021-03-27 14:27
 * @since JDK 1.8
 */
public class LinkedListTest
{

    @Test
    public void testP0143()
    {
        P0143ReorderList obj = new P0143ReorderList();
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        obj.reorderList(node1);
    }

    @Test
    public void testP0206()
    {
        P0206ReverseLinkedList obj = new P0206ReverseLinkedList();
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(0, node1);

        System.out.println("ListNode = " + head);

        head = obj.reverseListByIteration(head);
        System.out.println("ListNode = " + head);

        head = obj.reverseListByRecursion(head);
        System.out.println("ListNode = " + head);
    }

    @Test
    public void test0203()
    {
        P0203RemoveLinkedListElements obj = new P0203RemoveLinkedListElements();

        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(6, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);

        ListNode result = obj.removeElements_recursion(head, 6);
        while (result != null)
        {
            System.out.println(result.val);
            result = result.next;
        }

        System.out.println("result = " + obj.removeElements_iteration(null, 1));
    }
}
