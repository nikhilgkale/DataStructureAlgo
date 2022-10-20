package AdvancedDSA.LinkedList.RemoveLoopFromLinkedList;

import java.util.HashSet;

import AdvancedDSA.LinkedList.ListNode;

public class RemoveLoopFromLinkedList {
    public static void main(String[] args)
    {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        ListNode ln6 = new ListNode(6);
        ListNode ln7 = new ListNode(7);
        ListNode ln8 = new ListNode(8);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = ln6;
        ln6.next = ln7;
        ln7.next = ln4;
        ln8.next = ln4;

        //input
        int count = 0;
        ListNode inputHead = ln1;

        while(count < 9){
            System.out.print(inputHead.val+ "->");  
            inputHead = inputHead.next;
            count++;
        }
        //System.out.print("NULL");
        //System.out.println();
       //output
       System.out.println();
       ListNode reverseHead = solve(ln1);

       while(reverseHead != null){
           System.out.print(reverseHead.val+ "->");  
           reverseHead = reverseHead.next;
       }
       System.out.print("NULL");
       System.out.println();
    }

    public static ListNode solve(ListNode A) {
        HashSet<ListNode> hashSet = new HashSet<>();
	    ListNode lastNode = null;
	    ListNode curr = A;
        while (curr != null) {
	        if (hashSet.contains(curr)) {
	            break;
	        } else {
	            hashSet.add(curr);
	        }
            lastNode = curr;
	        curr = curr.next;
	    }

        lastNode.next = null;
	    
	    return A;
    }
}
