package AdvancedDSA.LinkedList.ReverseLinkListII;

import AdvancedDSA.LinkedList.ListNode;

public class ReverseLinkListII {
    public static void main(String[] args)
    {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        /*ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        ListNode ln6 = new ListNode(6);*/
        ln1.next = ln2;
        ln2.next = ln3;
        /*ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = ln6;*/

        //input
        ListNode inputHead = ln1;

        while(inputHead != null){
            System.out.print(inputHead.val+ "->");  
            inputHead = inputHead.next;
        }
        System.out.print("NULL");

        //output
        System.out.println();
        ListNode reverseHead = reverseBetween(ln1,2,5);

        while(reverseHead != null){
            System.out.print(reverseHead.val+ "->");  
            reverseHead = reverseHead.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static ListNode reverseBetween(ListNode A, int B, int C) {
        
        ListNode prev = null;
        ListNode curr = A;
        ListNode temp = null;
        ListNode revStartNode = null;
        ListNode revEndNode   = null;
        int start = B;
        int end   = C;
        start--;
        //C--;

        while(curr != null){

            if(start==0){
            
                if(revStartNode ==null){
                    revStartNode = curr;
                }

                while(curr != null && end!= 0){
                    temp      = curr.next;
                    curr.next = prev;
        
                    prev = curr;
                    curr = temp;
                    
                    end--;
                }
            }else{
                curr = curr.next;
                start--;
                end--;
            }

            if(C==0){
                A.next = prev;
                revStartNode.next = curr;
                break;
            }
        }
        return A;

        /*
         *  ListNode prev = null, 
             future = null, 
             sourceNode = null, 
             drainNode = null, 
             startNode = null, 
             endNode = null,
             temp = A;

        int pos = 1;

        if(temp == null || temp.next == null) {
            return A;
        }

        while(temp != null) {
            if(pos == B-1) {
                sourceNode = temp;
            }
    
            if(pos == B) {
                endNode = temp;
                future = temp;
            }

            if(pos == C) {
                startNode = temp;
            }

            if(pos == C+1) {
                drainNode = temp;
                break;
            }

            temp = temp.next;
            pos++;

            if(future != null) {
                //reverse the Node
                ListNode curr = future;
                future = curr.next;
                curr.next = prev;
                prev = curr;
            }
        }

        ListNode retNode = A;

        if(sourceNode == null) {
            sourceNode = startNode;
            retNode = sourceNode;
        } else {
            sourceNode.next = startNode;
        }

        endNode.next = drainNode;
        return retNode;
         */
    }
}
