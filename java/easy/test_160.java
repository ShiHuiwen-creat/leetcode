package easy;

public class test_160 {
    public static void main(String[] args) {

    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head1 = headA;
        ListNode head2 = headB;
        while (head1.val != head2.val){
            head1 = head1 == null ? head2 : head1.next;
            head2 = head2 == null ? head1 : head2.next;
        }
        return head1;
    }
}
