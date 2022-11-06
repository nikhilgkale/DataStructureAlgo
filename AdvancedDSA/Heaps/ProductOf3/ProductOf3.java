package AdvancedDSA.Heaps.ProductOf3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class ProductOf3 {
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>(); //A.add(1); A.add(2); A.add(3);A.add(4);A.add(5);
        A.add(10); A.add(2); A.add(13);A.add(4);
        ArrayList<Integer> output = solve(A);

        for(int i =0 ; i < output.size(); i++){
            System.out.print(output.get(i) + ", ");  
        }
        System.out.println();
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());//By default PQ is min heap in java
        for(int i =0 ; i < A.size(); i++){
            max.add(A.get(i));

            if(i < 2){
                output.add(-1);
            }else{
                int a = max.poll();
                int b = max.poll();
                int c = max.poll();

                output.add(a * b * c);
                max.add(a);
                max.add(b);
                max.add(c);
            }
        }

        return output;
    }
}
