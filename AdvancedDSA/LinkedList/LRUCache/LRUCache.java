package AdvancedDSA.LinkedList.LRUCache;

import java.util.HashMap;

public class LRUCache {

    int cap  = 0;
    int size = 0;
    HashMap<Integer,LinkNode> map = null;
    LinkNode head = null;
    LinkNode tail = null;

    public LRUCache(int capacity) {
        cap = capacity;
        map = new HashMap<>();

        head = new LinkNode(-1, -1);
        tail = new LinkNode(-1, -1);

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {

        if(map.containsKey(key)){
            LinkNode node = map.get(key);
            deleteNode(node);
            insertNodeAtTail(node);
            return node.val;
        }
        return -1;
    }
    
    public void set(int key, int value) {
        LinkNode node = null;

        if(map.containsKey(key)){
            node = map.get(key);
            node.val = value;
            deleteNode(node);
            insertNodeAtTail(node);
        }else{
            node = new LinkNode(key, value);
            if(size == cap){
                map.remove(head.next.key);
                deleteNode(head.next);
                size--;
            }   
                
            
            insertNodeAtTail(node);
            map.put(key, node);
            size++;
            System.out.println("Size : " + size);
        }
    }

    private void deleteNode(LinkNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertNodeAtTail(LinkNode node){
        node.next = tail;
        node.prev = tail.prev;
        
        node.prev.next = node;
        tail.prev      = node;

    }
}
