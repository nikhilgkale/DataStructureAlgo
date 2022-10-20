package AdvancedDSA.LinkedList.KReverseLinkedList;

import AdvancedDSA.LinkedList.ListNode;

public class KReverseLinkedList {

    public static void main(String[] args)
    {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        ListNode ln6 = new ListNode(6);
        ListNode ln7 = new ListNode(7);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = ln6;
        ln6.next = ln7;

        //input
        ListNode inputHead = ln1;

        while(inputHead != null){
            System.out.print(inputHead.val+ "->");  
            inputHead = inputHead.next;
        }
        System.out.print("NULL");

        //output
        System.out.println();
        ListNode reverseHead = reverseList(ln1,3);

        while(reverseHead != null){
            System.out.print(reverseHead.val+ "->");  
            reverseHead = reverseHead.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static ListNode reverseList(ListNode A, int B) {
        if(A == null) return A;

        ListNode prev = null;
        ListNode curr = A;
        ListNode temp = null;
        int k = B;

        while(curr != null && B > 0){
            temp = curr.next;
            curr.next = prev;

            prev = curr;
            curr = temp;

            B--;
        }

        ListNode new_head = reverseList(curr, k);
        A.next = new_head;

        return prev;
    }
}
