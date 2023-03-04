package Sorting.MinCost;

import java.util.Arrays;
import java.util.Collections;

//mincost to remove all elements from array
//cost of the removing element is sum of elements present inside the array at that time.
public class MinCost {
    public static void main(String[] args) {
        
        System.out.println("Minmum Cost of array : " + minCost(new Integer[]{ 5,3,1,-3}));
    }
     
    private static int minCost(Integer[] A){
        int cost = 0;

        Arrays.sort(A, Collections.reverseOrder());

        //contribution technique
        //{a0, a1, a2, a3} => a0+2a1+3a2+4a3 --- provided a0 being greatest
        for(int i = 0; i < A.length; i++){
           cost += (i+1) * A[i];
        }

        return cost;
    }
}
