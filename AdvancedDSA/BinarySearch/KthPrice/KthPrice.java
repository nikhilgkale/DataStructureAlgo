package AdvancedDSA.BinarySearch.KthPrice;

public class KthPrice {

    public static void main(String[] args)
    {
        System.out.println(solve(new int[]{2,1,4,3,2}, 3));
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int solve(final int[] A, int B) {
        
        int l = A[0];//min
        int r = A[0];//max

        for(int i = 0; i < A.length; i++){
            if(l > A[i]){
                l = A[i];
            }

            if(r < A[i]){
                r = A[i];
            }
        }
        int ans = r;

        while(l<=r){

            int mid = l + (r-l)/2;

            int count = 0;
            for(int i = 0; i < A.length; i++){
                if(A[i] <= mid){//no of intergers less than mid
                    count++;
                }
            }

            if(count >= B){
                ans = mid;
                r = mid -1;
            }else{
                l = mid + 1;
            }
        }

        return ans;
    }
}
