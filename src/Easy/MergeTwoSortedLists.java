package Easy;

import Easy.Commons.ListNode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        mergeLists(result, list1, list2);
        return result.next;
    }

    public void mergeLists(ListNode result, ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return;
        } else if (list1 != null && list2 == null) {
            result.next = list1;
            mergeLists(result.next, list1.next, null);
        } else if (list1 == null && list2 != null) {
            result.next = list2;
            mergeLists(result.next, null, list2.next);
        } else if (list1.val <= list2.val) {
            result.next = list1;
            mergeLists(result.next, list1.next, list2);
        } else {
            result.next = list2;
            mergeLists(result.next, list1, list2.next);
        }
    }
}
