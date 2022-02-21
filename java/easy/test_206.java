package easy;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class test_206 {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode listNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = listNode;
        }
        return prev;

    }
}
