package AdvancedDSA.LinkedList.MiddleElementOfLinkedList;

import AdvancedDSA.LinkedList.ListNode;

public class MiddleElementOfLinkedList {

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
        System.out.println(solve(ln1));  
    }

    public static int solve(ListNode A) {
        ListNode temp = A;
        int n = 0;

        while(temp != null){
            n++;
            temp = temp.next; 
        }

        int mid = n/2;
        /*
        if(n%2 == 0){
            mid += 1;
        }*/

        temp = A;
        while(temp != null & mid > 0){
            temp = temp.next;
            mid--;
        }
        return temp.val;
    }
}
