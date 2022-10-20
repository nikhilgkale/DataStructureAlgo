package AdvancedDSA.LinkedList.CloneLinkedList;

class ListNode {
    public int val;
    public ListNode next;
    public ListNode random;
    public ListNode(int x) { val = x; next = null; random = null; }
}

//https://leetcode.com/problems/copy-list-with-random-pointer/
public class CloneLinkedList {
    //Q : Given a link list where it additionally points (random) to some other node other than next node, clone it.

    //1.Create new LL & connect to OLD
    //2.Update random for the new node
    //3.Disconnect/Remove Old Nodes

    public static void main(String[] args)
    {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        ListNode ln6 = new ListNode(6);
        ln1.next   = ln2;
        ln1.random = ln3;
        ln2.next = ln3;
        ln3.next = ln4;
        ln3.random = ln5;
        ln4.next = ln5;
        ln5.next = ln6;

        //input
        ListNode inputHead = ln1;

        while(inputHead != null){
            if(inputHead.random !=null){
                //System.out.print(inputHead.val+ "[" + inputHead.random.val+ "]" + "->"); 
                System.out.print(inputHead.hashCode()+ "[" + inputHead.random.hashCode()+ "]" + "->"); 
            }else{
                System.out.print(inputHead.hashCode()+ "->"); 
            } 
            inputHead = inputHead.next;
        }
        System.out.print("NULL");

        //output
        System.out.println();
        ListNode cloneHead = new ListNode(-1);
        cloneHead.next     = clone(ln1);
        cloneHead = cloneHead.next;

        while(cloneHead != null){
            if(cloneHead.random !=null){
                //System.out.print(cloneHead.val+ "[" + cloneHead.random.val+ "]" + "->"); 
                System.out.print(cloneHead.hashCode()+ "[" + cloneHead.random.hashCode()+ "]" + "->");
            }else{
                //System.out.print(cloneHead.val+ "->");  
                System.out.print(cloneHead.hashCode()+ "->");
            }
            cloneHead = cloneHead.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static ListNode clone(ListNode A) {
        ListNode cloneList = createNewLL(A);//1

        updateRandomPointer(cloneList);//2

        removeOldNodes(cloneList);//3

        return cloneList;
    }

    private static ListNode createNewLL(ListNode B) {
        ListNode curr = B;

        while(curr != null){
            ListNode x = new ListNode(curr.val);
            x.next     = curr.next;
            curr.next  = x;
            curr       = x.next;
        }
        return B;
    }

    private static ListNode updateRandomPointer(ListNode C) {
        ListNode curr = C;
        ListNode ptr  = curr.next;

        while(curr != null){
            if(curr.random != null){
                ptr.random = curr.random.next;
            }

            curr = curr.next.next;

            if(ptr.next != null){
                ptr = ptr.next.next;
            }
        }

        return C;
    }

    private static ListNode removeOldNodes(ListNode D) {
        ListNode curr = D;
        ListNode ans  = D.next;
        ListNode ptr  = ans;

        
        while(curr != null){

            curr.next = curr.next.next;
            if(ptr.next != null){
                ptr.next = ptr.next.next;
            }
            ptr  = ptr.next;
            curr = curr.next;
        }

        ListNode cloneHead = ans;

        while(cloneHead != null){
            if(cloneHead.random !=null){
                //System.out.print(cloneHead.val+ "[" + cloneHead.random.val+ "]" + "->"); 
                System.out.print(cloneHead.hashCode()+ "[" + cloneHead.random.hashCode()+ "]" + "->");
            }else{
                //System.out.print(cloneHead.val+ "->");  
                System.out.print(cloneHead.hashCode()+ "->");
            }
            cloneHead = cloneHead.next;
        }
        System.out.print("NULL");
        System.out.println();

        return ans;
    }
}