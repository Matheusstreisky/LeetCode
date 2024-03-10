package Medium;

import Commons.ListNode;

public class RemoveNthNodeFromList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = new ListNode(0, head);
        int lenght = countNodeAmount(head);

        removeNthFromList(result, result.next, lenght - n);
        return result.next;
    }

    private int countNodeAmount(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }

        return count;
    }

    private void removeNthFromList(ListNode previousNode, ListNode currentNode, int n) {
        if (currentNode == null) {
            return;
        }

        if (--n < 0) {
            previousNode.next = currentNode.next;
            return;
        }

        removeNthFromList(currentNode, currentNode.next, n);
    }
}
