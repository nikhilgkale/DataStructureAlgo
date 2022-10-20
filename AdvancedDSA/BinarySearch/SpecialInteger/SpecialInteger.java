package AdvancedDSA.BinarySearch.SpecialInteger;

public class SpecialInteger {
    public int solve(int[] A, int B) {
        int l = 1; int r = A.length;
        int k = 0;
        while(l<=r){
            int mid = l+(r-l)/2;

            if(CheckSubArraySum(A,B,mid)){
                k=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }

        return k;
    }

    //Sliding Window - Subarray Sum
    private boolean CheckSubArraySum(int[] A, int B, int k){
        long maxSum = 0;
        
        int n = A.length;

        for(int i=0; i < k; i++){
            maxSum += A[i];
        }

        if(maxSum > B){
            return false;
        }

        long windowSum = maxSum;
        for(int i=k; i < n; i++){
            windowSum += A[i] - A[i-k];
            maxSum = Math.max(maxSum, windowSum);

            if(maxSum > B){
                return false;
            }
        }

        return true;
    }
}
