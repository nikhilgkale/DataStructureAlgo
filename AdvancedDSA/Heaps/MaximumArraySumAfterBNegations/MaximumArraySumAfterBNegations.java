package AdvancedDSA.Heaps.MaximumArraySumAfterBNegations;

import java.util.*;

public class MaximumArraySumAfterBNegations {
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>(); 
        
        A.add(24); A.add(-68); A.add(-29); A.add(-9); A.add(84); 
        int B = 4;

        System.out.println(solve(A, B));  
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int sum = 0;

        PriorityQueue<Integer> min = new PriorityQueue<>(); //In java PQ is min-heap
        for(int i =0 ; i < A.size(); i++){
            min.add(A.get(i));
        } 

        for(int i = 1; i <= B; i++){
            int min_val = min.poll();
            min_val = -(min_val);
            min.add(min_val);
        } 

        while(!min.isEmpty()){
            sum += min.poll();
        }


        return sum;
    }
}
