package AdvancedDSA.LinkedList.PalindromeList;

import AdvancedDSA.LinkedList.ListNode;

public class PalindromeList {
    public static void main(String[] args)
    {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(1);
        /*ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(3);
        ListNode ln6 = new ListNode(2);
        ListNode ln7 = new ListNode(1);*/
        ln1.next = ln2;
        /*ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = ln6;
        ln6.next = ln7;*/

        //input
        ListNode inputHead = ln1;

        while(inputHead != null){
            System.out.print(inputHead.val+ "->");  
            inputHead = inputHead.next;
        }
        System.out.print("NULL");
        System.out.println();
        //output
        System.out.println(lPalin(ln1));  
    }

    public static int lPalin(ListNode A) {
        if(A==null){
            return 0;
        }

        if(A.next==null){
            return 1;
        }

        ListNode h1  = A;
        ListNode mid = findMid(A);
        ListNode h2  = mid.next;
        //System.out.println(h1.val);  
        System.out.println(h2.val);  
        mid.next     = null;

        h2 = reverseList(h2);
        //System.out.println(h2.val); 
        return checkPalindrome(h1,h2);
    }

    private static ListNode findMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //if(fast.next != null){
        //    slow = slow.next;
        //}

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
    private static int checkPalindrome(ListNode A, ListNode B) {
       
        ListNode h1 = A , h2 = B ;

        while(h1 != null && h2 != null)
        {
            if(h1.val == h2.val){
                h1 = h1.next;
                h2 = h2.next;
            }else{
                //System.out.println(h2.val);  
                //System.out.println(h1.val);  
                return 0;
            }
        }
    
        return 1;    
    }
}
