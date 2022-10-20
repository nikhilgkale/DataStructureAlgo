/*
 * idea:

1. sort Array A
2.push all the elements of A in HashMap(frequency of the elements is required)
3.add each element of array B present in HashMap to its frequency also remove it after adding so that in 4th step the elements do not get added again.
4.add each element of array A present in HashMap to its frequency times and remove it so that i won’t get added again if the frequency is more than 1.

example for dry run: A=[5, 1, 2, 4, 2, 5, 1] , B=[5, 4, 2]
output: [5, 5, 4, 2, 2, 1, 1]
 */
package AdvancedDSA.Hashing.SortArrayInGivenOrder;

import java.util.*;

public class SortArrayInGivenOrder {

    public static void main(String[] args)
    {
        int[] output = solve(new int[]{3, 20, 17, 17}, new int[]{5, 9, 20, 11, 6, 18, 7, 13});
        
        System.out.println();  
        for(int i = 0; i < output.length; i++)
            System.out.print(output[i]+ ",");  
    }

    public static int[] solve(int[] A, int[] B) {
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        ArrayList<Integer> result= new ArrayList<>();

        for(int i = 0; i < A.length; i++){
            if(tm.containsKey(A[i])){
                tm.put(A[i], tm.get(A[i])+1);
            }else{
                tm.put(A[i], 1);
            }
        }

        for(int i = 0; i < B.length; i++){
            if(tm.containsKey(B[i])){
                for(int j = 0; j < tm.get(B[i]); j++){
                    result.add(B[i]);
                }
                tm.put(B[i], 0);
            }
        }

        for (Map.Entry<Integer, Integer>
                 entry : tm.entrySet()){
            int count = entry.getValue();

            while(count != 0){
                result.add(entry.getKey());
                count--;
           }
        }

        return  result.stream().mapToInt(i -> i).toArray();
    }
}
