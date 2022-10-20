package AdvancedDSA.BinarySearch.SquareRootOfInteger;

public class SquareRootOfInteger {
    public int sqrt(int A) {
        int ans = 0;
        int l = 1; int r = A;

        if(A==0) return 0;
        if(A==1) return 1;
        
        while(l<=r){
            int mid = l + (r-l)/2;
            if(mid == A/mid){
                ans = mid;
                return mid;
            }
            else if(mid < A/mid){
                ans = mid;
                l = mid +1;
            }else{
                r = mid-1;
            }
        }
        return ans;
    }
}
