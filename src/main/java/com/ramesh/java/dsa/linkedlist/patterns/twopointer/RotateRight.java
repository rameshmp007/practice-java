package com.ramesh.java.dsa.linkedlist.patterns.twopointer;

import com.ramesh.java.dsa.linkedlist.examples.ListNode;

public class RotateRight {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = rotateRight(head, 2);

        while(result.next != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.print(result.val + " -> ");
        System.out.println("null");
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }
        int size = sizeOfLinkedList(head);
        ListNode result = head;
        for(int i = 0; i < (k % size); i++) {
            result = rotate(result);
        }
        return result;
    }

    public static ListNode rotate(ListNode head) {
        ListNode cur = head;
        while(cur.next.next != null) {
            cur = cur.next;
        }
        ListNode temp = cur.next;
        temp.next = head;
        cur.next = null;
        head = temp;
        return head;
    }

    public static int sizeOfLinkedList(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
}
