package AdvancedDSA.LinkedList.PartitionList;

import AdvancedDSA.LinkedList.ListNode;

public class PartitionList {
    public static void main(String[] args)
    {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(4);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(2);
        ListNode ln5 = new ListNode(5);
        ListNode ln6 = new ListNode(2);
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
        ListNode reverseHead = partition(ln1,3);

        while(reverseHead != null){
            System.out.print(reverseHead.val+ "->");  
            reverseHead = reverseHead.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static ListNode partition(ListNode A, int B) {

        ListNode curr = A;
        ListNode h1   = null;
        ListNode t1   = null;
        ListNode h2   = null;
        ListNode t2   = null;


        while(curr != null){
            if(curr.val < B){
                ListNode t = new ListNode(curr.val);
                if(h1 == null){
                    h1 = t;
                    t1 = h1;
                }else{
                    t1.next = t;
                    t1 = t1.next;
                }
            }else{
                ListNode t = new ListNode(curr.val);
                if(h2 == null){
                    h2 = t;
                    t2 = h2;
                }else{
                    t2.next = t;
                    t2      = t2.next;
                }
            }
            curr = curr.next;
        }

        if(t1 == null){
            return h2;
        }
        else if(t2 == null){
            return h1;
        }
        t1.next = h2;
        return h1;
    }
}
