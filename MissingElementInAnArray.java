class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        // Sample sorted linked lists
        ListNode list1 = createLinkedList(new int[] { 1, 3, 5, 7 });
        ListNode list2 = createLinkedList(new int[] { 2, 4, 6, 8 });

        // Merge the two lists and display the result
        ListNode mergedList = mergeSortedLists(list1, list2);

        System.out.println("Merged Sorted Linked List:");
        printLinkedList(mergedList);
    }

    private static ListNode mergeSortedLists(ListNode l1, ListNode l2) {
        // Dummy node to simplify the code
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Merge the two sorted linked lists
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // If one list is longer than the other, append the remaining nodes
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }

    private static ListNode createLinkedList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    private static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
