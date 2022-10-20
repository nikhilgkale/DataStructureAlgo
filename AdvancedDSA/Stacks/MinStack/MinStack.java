package AdvancedDSA.Stacks.MinStack;

class Node
{
    int value;
    Node pointer;       
    Node(int d) {value = d; pointer = null; }
}
public class MinStack {
    Node head = null;   
    Node minHead = null;    

    public void push(int x) {
        Node newNode = new Node(x);
        if(head == null){
            head    = newNode;
            minHead = newNode;
        }else{
            newNode.pointer = head;
            head            = newNode;

            if(minHead != null && minHead.value > newNode.value){
                Node newMinNode    = new Node(x);
                newMinNode.pointer = minHead;
                minHead            = newMinNode;
            }
        }
    }

    public void pop() {
        if(head != null){

            if(head.value == minHead.value){
                minHead = minHead.pointer;
            }
            head = head.pointer;
        }
    }

    public int top() {
        int topValue = -1;
        
        if(head != null){
            topValue = head.value;
        }
        return topValue;
    }

    public int getMin() {
        int minValue = -1;

        if(minHead != null){
            minValue = minHead.value;
        }
        return minValue;
    }
}
