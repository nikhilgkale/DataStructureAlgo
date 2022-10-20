package AdvancedDSA.LinkedList.RemoveDuplicatesFromSortedList;

import AdvancedDSA.LinkedList.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args)
    {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(1);
        ListNode ln3 = new ListNode(1);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(4);
        ListNode ln6 = new ListNode(6);
        ListNode ln7 = new ListNode(6);
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
        ListNode reverseHead = deleteDuplicates(ln1);

        while(reverseHead != null){
            System.out.print(reverseHead.val+ "->");  
            reverseHead = reverseHead.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    public static ListNode deleteDuplicates(ListNode A) {

        if(A == null || A.next == null){
            return A;
        }
        ListNode curr = A;
        ListNode temp = null;

        while(curr != null && curr.next!= null){
            if(curr.val != curr.next.val){
                curr = curr.next;
            }else{
                temp = curr;
                while(temp != null && temp.val == curr.val){
                    temp = temp.next;
                }
                curr.next = temp;
                curr      = curr.next;
            }
        }

        deleteDuplicates(curr);

        return A;
    }
}
