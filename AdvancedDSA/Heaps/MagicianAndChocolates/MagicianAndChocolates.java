package AdvancedDSA.Heaps.MagicianAndChocolates;

import java.util.*;

public class MagicianAndChocolates {
    public static void main(String[] args)
    {
        ArrayList<Integer> B = new ArrayList<>();
    
        B.add(2); B.add(4); B.add(6); B.add(8); B.add(10); 
        //B.add(6); B.add(5); 
        int A = 5;//3;

        System.out.println(nchoc(A, B));  
    }

    public static int nchoc(int A, ArrayList<Integer> B) {
        long mod = 1000000007;
        long total = 0;

        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder()); //In java PQ is min-heap
        for(int i =0 ; i < B.size(); i++){
            max.add(B.get(i));
        } 
        
        while(A != 0 && !max.isEmpty()){
            int chocCount = max.poll();
    
            if(chocCount > 0){
                
                total = ((total % mod)+(chocCount % mod)) % mod;

                int newChoc = (int) Math.floor(chocCount/2);
                max.add(newChoc);
            }
            A--;
        }
        if (total < 0) {
            total = ((total + mod) % mod);
        }

        return (int)(total%mod);
    } 
}
