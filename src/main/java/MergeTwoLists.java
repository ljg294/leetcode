public class MergeTwoLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

        MergeTwoLists solution = new MergeTwoLists();

        ListNode list1 = solution.new ListNode(1, solution.new ListNode(2, solution.new ListNode(4)));
        ListNode list2 = solution.new ListNode(1, solution.new ListNode(3, solution.new ListNode(4)));

        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1,
                                  ListNode list2) {
        ListNode dummyNode = new ListNode(0);
        ListNode currentNode = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }

        if (list1 != null) {
            currentNode.next = list1;
        } else {
            currentNode.next = list2;
        }

        return dummyNode.next;
    }
}