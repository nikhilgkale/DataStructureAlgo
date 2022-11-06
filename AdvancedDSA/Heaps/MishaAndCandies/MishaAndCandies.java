package AdvancedDSA.Heaps.MishaAndCandies;

import java.util.*;

public class MishaAndCandies {
    
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>(); //A.add(3); A.add(2); A.add(3);
        //A.add(1);A.add(2);A.add(1);
        A.add(324); A.add(458); A.add(481); A.add(167); A.add(939); A.add(444); A.add(388); A.add(612); 
        A.add(943); A.add(890); A.add(953); A.add(403);  A.add(653);  A.add(136);  A.add(168);  A.add(163);  A.add(186);  A.add(471);  
        int B = 231;//4;//2;

        System.out.println(solve(A, B));  
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int total = 0;

        PriorityQueue<Integer> min = new PriorityQueue<>(); //In java PQ is min-heap
        for(int i =0 ; i < A.size(); i++){
            min.add(A.get(i));
        } 
        
        while(min.size()>0){
            int min1 = min.poll();
    
            if(min1 <= B){
                int count = (int) Math.floor(min1/2);
                total     += count;

                if(min.isEmpty()){
                    break;
                }

                int min2 = min.poll();
                min.add(min2+min1-count);
            }
        }

        return total;
    }
}
