package AdvancedDSA.Queue.NIntegersContainingOnly1n2n3;

import java.util.*;

public class NIntegersContainingOnly1n2n3 {
    public static void main(String[] args)
    {
        int[] A = solve(7);

        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + ", ");  
        }
    }

    public static int[] solve(int A) {
        List <Integer> response = new ArrayList<Integer>();

        Queue<Integer> queue = new LinkedList<Integer>(); 

        queue.add(1);
        queue.add(2);
        queue.add(3);


        while(response.size() < A){
            int curr = queue.poll();
            response.add(curr);

            queue.add(curr * 10 + 1);
            queue.add(curr * 10 + 2);
            queue.add(curr * 10 + 3);
        }
        queue.clear();
        
        return response.stream().mapToInt(v->v).toArray();
    }
}
