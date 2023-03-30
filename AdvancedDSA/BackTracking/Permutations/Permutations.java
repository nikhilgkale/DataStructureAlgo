package AdvancedDSA.BackTracking.Permutations;

import java.util.*;

public class Permutations {
    public static void main(String[] args)
    {
    
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(1); input.add(2); input.add(3);

        ArrayList<ArrayList<Integer>> output = permute(input);
        if(output != null){
         
            for(int i = 0; i < output.size(); i++){
                ArrayList<Integer> subset = output.get(i);
                for(int j = 0; j < subset.size(); j++){
                    System.out.print(subset.get(j)); 
                    if(j != subset.size()-1){
                        System.out.print("," ); 
                    }
                }
                System.out.println();
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A){
        ArrayList<ArrayList<Integer>> resList = new ArrayList<ArrayList<Integer>> ();
       // parameter required are - start index, input array and temp placehoder
        compute(0, A, new ArrayList<>(), resList);
       return resList;
     }
     
     public static void compute(int index, ArrayList <Integer> A, 
     ArrayList<Integer> tempList, ArrayList<ArrayList<Integer>> result){
         // BASE condition
        if (index ==A.size()){
          //System.out.print("," ); 
          result.add(new ArrayList<>(tempList));
          }
     
      //lets iterate and get element from next position to index position 
      for(int l =index;l<A.size();l++){
          //DO step
          swap (index, l, A);
          //Recursion call for next index elements - solving subproblem
          compute(index+1, A, tempList, result);
          //UNDO step - restore original condition
          swap(l, index, A);
       }
     }
     
      //swapping list elements
      public static void swap(int src , int dest, ArrayList<Integer> A){
        System.out.print("src : " + A.get(src)); 
        System.out.print("dest : " + A.get(dest)); 
         int temp = A.get(src);
         A.set(src, A.get(dest));
         A.set(dest, temp);
       }
}
