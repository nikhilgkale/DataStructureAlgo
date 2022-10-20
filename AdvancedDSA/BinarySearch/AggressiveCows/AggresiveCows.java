package AdvancedDSA.BinarySearch.AggressiveCows;

import java.util.Arrays;

public class AggresiveCows {

    public int solve(int[] A, int B) {
        Arrays.sort(A);

        int n = A.length;
        int l = 1;
        int r = A[n-1]-A[0];
        int ans = 0;
        
       

        while(l<=r){

            int mid = l+ (r-l)/2;

            if(CheckCowPlaced(A, B, mid)){
                ans = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return ans;
    }

    private boolean CheckCowPlaced(int[] A, int B, int mid){
        int last_placed_cow   = A[0];
        int number_cow_placed = 1;

        for(int i = 1; i < A.length; i++){
            if(A[i]-last_placed_cow >= mid){
                last_placed_cow = A[i];
                number_cow_placed++;

                if(number_cow_placed >= B){
                    return true;
                }
            }
        }
        return false;
    }    
}
