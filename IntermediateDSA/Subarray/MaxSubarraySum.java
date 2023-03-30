package Subarray;

public class MaxSubarraySum {
    
    public static void main(String[] args) {
        System.out.println("Maximum Subarray Sum : ");
        System.out.println(Solve(new int[]{-20,10,-12,6,5,-3,8,9}));
    }

    public static long Solve(int[] A) {
        long subSum=0; long ans = Integer.MIN_VALUE;
        
        int n = A.length;
        
        for(int i =0; i < n; i++){
            subSum = subSum + A[i];

            ans = Math.max(ans, subSum);

            if(subSum < 0){
                subSum = 0;
            }
        }

        return ans;
    }
}
