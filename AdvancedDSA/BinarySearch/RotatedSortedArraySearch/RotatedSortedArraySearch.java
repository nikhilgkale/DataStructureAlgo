package AdvancedDSA.BinarySearch.RotatedSortedArraySearch;

public class RotatedSortedArraySearch {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int B) {
        int l = 0; int r = A.length-1;

        while(l<=r){
            int mid = l + (r-l)/2;

            if(A[mid]==B){
                return mid;
            }else if(A[mid] > A[l]){
                if(A[l] <= B && B<A[mid]){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if(A[mid] < B && B<=A[r]){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}
