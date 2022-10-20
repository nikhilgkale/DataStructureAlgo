package AdvancedDSA.LinkedList.ReorderList;

import AdvancedDSA.LinkedList.ListNode;

public class ReorderList {

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
        System.out.println();
        //output
        System.out.println();
        ListNode reorderHead = reorderList(ln1);

        while(reorderHead != null){
            System.out.print(reorderHead.val+ "->");  
            reorderHead = reorderHead.next;
        }
        System.out.print("NULL");
        System.out.println(); 
    }

    //1.Create two LL
    //2.Reverse 2nd LL
    //3.Merge two LL
    public static ListNode reorderList(ListNode A) {
        
        //1.Create two LL
        ListNode mid  = findMid(A);
        ListNode h2   = mid.next;
        mid.next      = null;

        ListNode reverseHead = reverseList(h2); 
        
        A = mergeTwoLists(A,reverseHead);

        return A;
    }

    private static ListNode findMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast.next != null){
            slow = slow.next;
        }

        return slow;
    }

    private static ListNode reverseList(ListNode C){
        ListNode prev = null;
        ListNode curr = C;
        ListNode temp = null;

        while(curr != null){
            temp      = curr.next;
            curr.next = prev;

            prev      = curr;
            curr      = temp;
        }

        return prev;
    }
    private static ListNode mergeTwoLists(ListNode A, ListNode B) {
       
        ListNode temp1 = null;
        ListNode temp2 = null;

        ListNode h1 = A , h2 = B ;

        while(h1 != null && h2 != null)
        {
            temp1   = h1.next;
            h1.next = h2;

            temp2   = h2.next;
            h2.next = temp1;

            h1 = temp1;
            h2 = temp2;
        }
    
        return A;    
    }
}
