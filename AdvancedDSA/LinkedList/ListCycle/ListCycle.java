package AdvancedDSA.LinkedList.ListCycle;

import AdvancedDSA.LinkedList.ListNode;

public class ListCycle {
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
        ListNode reorderHead = detectCycle(ln1);
        System.out.println(reorderHead.val);   
    }

    public static ListNode detectCycle(ListNode a) {
        boolean flag = false;
        ListNode fast = a;
        ListNode slow = a;

        while(slow != null && fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                flag = true;
                break;
            }
        }

        if(flag){
            ListNode A = a;
            ListNode B = slow;
            while(B!=A){
                B=B.next;
                A=A.next;
            }
            return A;
        }

        return null;
	}
}
