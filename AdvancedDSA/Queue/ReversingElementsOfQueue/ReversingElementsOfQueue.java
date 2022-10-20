package AdvancedDSA.Queue.ReversingElementsOfQueue;

import java.util.*;

public class ReversingElementsOfQueue {

    public static void main(String[] args)
    {
        int[] A = solve(new int[]{1,2,3,4,5}, 3);

        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + ", ");  
        }
    }
/* public static int[] solve(int[] A, int B) {

        Queue<Integer> queue = new LinkedList<Integer>(); 
        Stack<Integer> stack = new Stack<Integer>(); 

        for(int i = 0; i < B; i++){
            queue.add(A[i]);
        }

        int C = B;
        while(C > 0){
            stack.push(queue.peek());
            queue.poll();
            C--;
        }

        C = 0;
        while(B > 0){
            A[C] = stack.peek();
            stack.pop();
            B--;
            C++;
        }

        return A;
    }*/
    public static int[] solve(int[] A, int B) {

        Queue<Integer> queue = new LinkedList<Integer>(); 

        for(int i = 0; i < B; i++){
            queue.add(A[i]);
        }

        int C = B-1;
        while(B > 0){
            A[C] = queue.poll();
            B--;
            C--;
        }

        return A;
    }
}
