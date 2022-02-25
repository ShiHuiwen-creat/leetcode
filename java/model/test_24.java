package model;


import java.util.Scanner;

import easy.*;

/**
 * @author SHW
 * @date 2022/2/24 14:33
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class test_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;

    }
}
