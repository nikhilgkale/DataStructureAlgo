package AdvancedDSA.Queue.PerfectNumbers;

import java.util.*;

public class PerfectNumbers {
    public static void main(String[] args)
    {
        System.out.println(solve(3));  
    }

    public static String solve(int A) {
        Queue<String> queue = new LinkedList<String>(); 

        queue.add("11");
        queue.add("22");

       

        while(A-1 != 0){
            String curr = queue.peek();

            int size = curr.length();
            String S1 = curr.substring(0, size/2);
            String S2 = curr.substring(size/2, size);

            queue.add(S1 + "11" + S2);
            queue.add(S1 + "22" + S2);

            queue.poll();
            A--;
        }

        return queue.poll();
    }
}
