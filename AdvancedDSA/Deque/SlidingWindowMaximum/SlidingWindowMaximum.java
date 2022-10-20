package AdvancedDSA.Deque.SlidingWindowMaximum;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();//1, 3, -1, -3, 5, 3, 6, 7
        list.add(1); list.add(3); list.add(-1); 
        list.add(-3); list.add(5); list.add(3); 
        list.add(6); list.add(7);

        ArrayList<Integer> outputList = slidingMaximum(list, 3);
        
        System.out.println();  
        for(int i = 0; i < outputList.size(); i++){
            System.out.print(outputList.get(i) + ", ");  
        } 
    }

    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Deque<Integer> deque = new ArrayDeque<Integer>();

        int i = 0;
        for(; i < B; i++){
            while(!deque.isEmpty() && deque.peekLast() < A.get(i)){
                deque.pollLast();
            }
            deque.addLast(A.get(i));
        }
        list.add(deque.peekFirst());

        int e = B;

        while(e < A.size()){
            //incoming element
            while(!deque.isEmpty() && deque.peekLast() < A.get(e)){
                deque.pollLast();
            }
            deque.addLast(A.get(e));

            //outgoing element
            if(!deque.isEmpty() && deque.peekFirst() == A.get(e-B)){
                deque.pollFirst();
            }
            list.add(deque.peekFirst());

            e++;
        }

        return list;
    }
}
