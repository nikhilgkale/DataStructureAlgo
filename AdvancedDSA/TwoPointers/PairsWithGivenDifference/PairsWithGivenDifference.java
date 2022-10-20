package AdvancedDSA.TwoPointers.PairsWithGivenDifference;
import java.lang.Math;
import java.util.Arrays;

public class PairsWithGivenDifference {
    
    public static void main(String[] args)
    {
        System.out.println(solve(new int[]{2,1,4,3,2}, 3));
    }

    public static int solve(int[] A, int B) {
        int count = 0;
        int i = 0;
        int j = 1;
        int n = A.length;

        Arrays.sort(A);

        while(j<n){
            if(Math.abs(A[j]-A[i]) == B){
                count++;
                i++;
                j++;

                while(j< n && A[j] == A[j-1]){
                    j++;
                }
            }else if(Math.abs(A[j]-A[i]) > B){
                i++;
                if(i==j){
                    j++;
                }
            }else{
                j++;
            }
        }

        return count;
    }
}
