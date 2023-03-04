package Sorting.MinDifference;

import java.util.Arrays;

//Find min diff of |A[i] - A[j]| such that i != j
public class MinDifference {
    public static void main(String[] args) {
        
        System.out.println("Min. diff |A[i]-A[j]| i!= j in array : " + minDifference(new int[]{ 1,4, 6, 8, 5}));
    }
     
    private static int minDifference(int[] A){
        int ans = Integer.MAX_VALUE;

        Arrays.sort(A);

        for(int i = 0; i < A.length - 1; i++){
            ans = Math.min(ans, A[i+1] - A[i]);
        }

        return ans;
    }
}
