package AdvancedDSA.Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ConnectRopes {
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>(); A.add(5); A.add(17); A.add(100);A.add(11);
    
        System.out.println(solve(A));  
    }

    public static int solve(ArrayList<Integer> A) {
        int total = 0;

        PriorityQueue<Integer> min = new PriorityQueue<>(); //In java PQ is min-heap
        for(int i =0 ; i < A.size(); i++){
            min.add(A.get(i));
        } 
        
        while(min.size()>1){
            int min1 = min.poll();
            int min2 = min.poll();

            total += min1 + min2;
            min.add(min1+min2);
        }

        return total;
    }
}
