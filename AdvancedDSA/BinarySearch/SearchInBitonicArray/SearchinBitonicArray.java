

package AdvancedDSA.BinarySearch.SearchInBitonicArray;

/* This question is simlar to the rotated sorted array.
 we will solve this in 3log(N) approach
 1st bin Search to find the pivot element -> log(n).
 2nd bin Search to find the element from 0 -> Pivot -> log(n). [Array is in increasing order]
 3rd bin Search to find the element from Pivot+1 -> N-1 -> log(n). [Array is in decreasing order]
 Total time complexity is O(logN) <- O(3logN) <- O(logN+logN+logN).
 However, since constraints is till 10^8, even a simple linear Search TC O(N) will alsso accepted for this question.
*/

public class SearchinBitonicArray {
    public int solve(int[] A, int B) {
     
     int n = A.length;

     int l = 0; int r = A.length-2;
     int pivot = 0;

     if(A[n-1] > A[n-2]){
         pivot = A[n-1];
     }
     // find the bitonic point.


     while(l<=r){
        int mid = l + (r-l)/2;

        if (A[mid]>A[mid-1] && A[mid] > A[mid+1]){
            pivot = mid;
            break;
        }else if(A[mid] < A[mid-1]){
           r = mid-1;
        }else{
           l = mid+1;
        }
     }

    // now that we have got the pivot we just have to do 2 binary searches 1 from 0->pivot && other from pivot+1 -> N-1.
     
     l=0; r=pivot;
     while(l<=r){
        int mid = l + (r-l)/2;

        if(A[mid]==B){
            return mid;
        }else if(A[mid] < B){
           l = mid+1;
        }else{
           r = mid-1; 
        }
     }

 
     // elements from pivot to n-1 would be in descending order so adjust the conditions accordingly.
     l=pivot+1; r=n-1;
     while(l<=r){
        int mid = l + (r-l)/2;

        if(A[mid]==B){
            return mid;
        }else if(A[mid] < B){
           r = mid-1;
        }else{
           l = mid+1; 
        }
     }
     return -1;
    }
}

// /* Linear Search O(N) approach
// public class Solution {
//     public int solve(int[] A, int B) {
//        int N = A.length;
//         for (int i=0; i< N; i++){
//             if (A[i] == B)
//                 return i;
//         }
//         return -1;
//     }
// }*/