package AdvancedDSA.LinkedList.FlattenLinkedList;



class ListFlattendNode {
    int val;
    ListFlattendNode right, down;
    ListFlattendNode(int x) {
        val = x;
        right = down = null;
    }
}

public class FlattenLinkedList {

    public static ListFlattendNode flatten(ListFlattendNode root) {
        if(root == null || root.right == null){
            return root;
        }

        ListFlattendNode mid      = findMid(root);
        ListFlattendNode afterMid = mid.right;
        mid.right = null;

        ListFlattendNode h1 = flatten(root);
        ListFlattendNode h2 = flatten(afterMid);

        return mergeTwoListsSorted(h1,h2);
    }

    private static ListFlattendNode findMid(ListFlattendNode head){
        ListFlattendNode fast = head;
        ListFlattendNode slow = head;

        while(fast.right != null && fast.right.right != null){
            slow = slow.right;
            fast = fast.right.right;
        }
        /* 
        if(fast.right != null){
            slow = slow.right;
        }
        */
        return slow;
    }

    public static ListFlattendNode mergeTwoListsSorted(ListFlattendNode A, ListFlattendNode B) {
        ListFlattendNode dummy = new ListFlattendNode(-1);
        ListFlattendNode tail  = dummy;

        ListFlattendNode h1 = A , h2 = B;

        while(h1 != null && h2 != null)
        {
            if(h1.val < h2.val)
            {
                tail.down = h1;
                h1 = h1.down;
            }
            else{
                tail.down = h2;
                h2 = h2.down;
            }
            tail = tail.down;
        }

        if(h1 != null)
        {
            tail.down = h1;
        }
        if(h2 != null)
        {
            tail.down = h2;
        }
        return dummy.down;    
    }
}
