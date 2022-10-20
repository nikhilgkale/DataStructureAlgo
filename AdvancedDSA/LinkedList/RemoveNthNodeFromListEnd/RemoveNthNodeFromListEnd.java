package AdvancedDSA.LinkedList.RemoveNthNodeFromListEnd;

import AdvancedDSA.LinkedList.ListNode;

public class RemoveNthNodeFromListEnd {
    
    public static void main(String[] args)
    {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        ListNode ln6 = new ListNode(6);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = ln6;

        //input
        ListNode inputHead = ln1;

        while(inputHead != null){
            System.out.print(inputHead.val+ "->");  
            inputHead = inputHead.next;
        }
        System.out.print("NULL");

        //output
        System.out.println();
        ListNode reverseHead = removeNthFromEnd(ln1,6);

        while(reverseHead != null){
            System.out.print(reverseHead.val+ "->");  
            reverseHead = reverseHead.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static ListNode removeNthFromEnd(ListNode A, int B) {
        if(A==null){
            return null;
        }

        ListNode temp = A;
        int n = 0;

        while(temp != null){
            n++;
            temp = temp.next; 
        }

        if(B>=n){
            temp = A.next;
            A.next = null;

            return temp;
        }else{
            int k = n-B;
            temp = A;
            while(temp != null && ((k-1)) > 0){
                temp = temp.next;
                k--;
            }
            temp.next = temp.next.next;
        }

        return A;
    }
}
