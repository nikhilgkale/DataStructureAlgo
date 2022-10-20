package AdvancedDSA.LinkedList.MergeTwoSortedLists;

import AdvancedDSA.LinkedList.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args)
    {
        ListNode ln1 = new ListNode(5);
        ListNode ln2 = new ListNode(8);
        ListNode ln3 = new ListNode(20);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(11);
        ListNode ln6 = new ListNode(15);
        ln1.next = ln2;
        ln2.next = ln3;
        
        ln4.next = ln5;
        ln5.next = ln6;

        //input - Ln1 list
        ListNode inputHead = ln1;

        while(inputHead != null){
            System.out.print(inputHead.val+ "->");  
            inputHead = inputHead.next;
        }
        System.out.print("NULL");

         //input - Ln4 list
         System.out.println();
        inputHead = ln4;

        while(inputHead != null){
            System.out.print(inputHead.val+ "->");  
            inputHead = inputHead.next;
        }
        System.out.print("NULL");

        //output
        System.out.println();
        ListNode reverseHead = mergeTwoLists(ln1,ln4);

        while(reverseHead != null){
            System.out.print(reverseHead.val+ "->");  
            reverseHead = reverseHead.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    public static ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode dummy = new ListNode(-1) ;
        ListNode tail = dummy ;

        ListNode h1 = A , h2 = B ;

        while(h1 != null && h2 != null)
        {
            if(h1.val < h2.val)
            {
                tail.next = h1 ;
                h1 = h1.next ;
            }
            else{
                tail.next = h2 ;
                h2 = h2.next ;
            }
            tail = tail.next ;
        }

        if(h1 != null)
        {
            tail.next = h1 ;
        }
        if(h2 != null)
        {
            tail.next = h2 ;
        }
        return dummy.next ;    
    }
}
