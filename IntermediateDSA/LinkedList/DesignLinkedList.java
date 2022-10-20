package LinkedList;

import java.util.LinkedList;

public class ListNode extends LinkedList
{
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}
public class DesignLinkedList {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(solve(new int[]{ 814, 761, 697, 483, 981  }));
    }

    public ListNode solve(int[][] A) {

        ListNode node = null;

        for(int i=0; i<A.length; i++){

            switch(A[i][0]) {
                case 0:
                    if(node == null){
                        node = new ListNode(A[i][1]);
                    }else{
                        ListNode node1 = new ListNode(A[i][1]);
                        ListNode temp  = node;
                        node           = node1;
                        node1.next     = temp;
                    }
                    break;
                case 1:
                    ListNode node1 = new ListNode(A[i][1]);
                    ListNode head  = node;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = node1;
                    break;
                case 2:
                    if(node.size() == A[2][2]){
                        ListNode node1 = new ListNode(A[i][1]);
                        ListNode temp  = node;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = node1;
                    }
                    break;
                case 3:
                    int idx = A[i][1]-1;

                    if(idx <= node.size()){
                        ListNode temp  = node;
                        while(idx > 0){           
                            idx--;
                        }
                        temp.next = temp.next.next;
                    }
                    break;
            } 
        }
    }
}
