package AdvancedDSA.TwoPointers.ThreeSum;
//

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args)
    {
        int[] A   = new int[]{  5, -2, -1, -10, 10 };//-5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3};
        int B     = 5;//-1;

        int output = threeSumClosest(A, B);
        System.out.println(output);  
    }
    public static int threeSumClosest(int[] A, int B) {

        Arrays.sort(A);
        int n = A.length;
        int total3 = Integer.MIN_VALUE;
       
        for(int k = 0; k < n; k++){
        
            int sum = B-A[k];

            int i = k+1;
            int j = n-1;

            while(i<j){
                if((long)A[i]+(long)A[j] == (long)sum){
                    total3 = Math.max(total3, (A[k]+A[i]+A[j]));
                    break;
                }else if((long)A[i]+(long)A[j] > (long)sum){
                    j--;
                }else{
                    total3 = Math.max(total3, (A[k] + A[i]+A[j]));
                    i++;
                }
            }
            
        }

        return total3;
    }
}
