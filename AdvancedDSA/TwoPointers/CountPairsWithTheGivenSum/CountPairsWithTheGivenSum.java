package AdvancedDSA.TwoPointers.CountPairsWithTheGivenSum;

public class CountPairsWithTheGivenSum {
    public static void main(String[] args)
    {
        System.out.println(solve(new int[]{1,2,3,4,5,6}, 5));  
    }

    public static int solve(int[] A, int B) {
        int count = 0;
        int n = A.length;
        int i = 0;
        int j = n-1;

        while(i<j){
            if(A[i]+A[j] == B){
                count++;
                i++;
                j--;
            }else if(A[i]+A[j] > B){
                j--;
            }else{
                i++;
            }
        }

        return count;
    }
}
