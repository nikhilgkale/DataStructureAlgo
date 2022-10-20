package AdvancedDSA.BinarySearch.MatrixSearch;

public class MatrixSearch {
    public static void main(String[] args)
    {
        System.out.println(searchMatrix(new int[][]{
        {1,   3,  5,  7},
        {10, 11, 16, 20},
        {23, 30, 34, 50}}, 11));
    }

    //Approach 1 (Two BS)TC = log n + log m
    /*public static int searchMatrix(int[][] A, int B) {

        int n = A.length;
        int m = A[0].length;

        //row wise BS
        int t = 0;
        int b = n-1;

        while(t<=b){
            int mid = (t+b)/2;

            if(A[mid][0] <= B &&  B <= A[mid][m-1]){

                if(A[mid][0] == B || A[mid][m-1] == B){
                    return 1;
                }
                
                //Column wise BS
                int l = 0;
                int r = m-1;

                while(l<=r){
                    int cent = (l+r)/2;

                    if(A[mid][cent] == B){
                        return 1;
                    }else if(A[mid][cent] < B){
                        l = cent+1;
                    }else{
                        r = cent-1;
                    }
                }
                return 0;
            }else if(A[mid][m-1] < B){
                t = mid+1;
            }else{
                b = mid-1;
            }
        }
        return 0;
    }*/

    //TC = log(m*n) => log n + log m 
    //Approach 2 : Treating Matrix as a single array
    public static int searchMatrix(int[][] A, int B) {

        int n = A.length;
        int m = A[0].length;

        int l = 0;
        int r = n*m-1;

        while(l<=r){
            int mid = l + (r-l)/2;

            int row = mid/m;
            int col = mid%m;

            if(A[row][col]==B){
                return 1;
            }else if(A[row][col]<B){
                l = mid+1;
            }else{
                r= mid-1;
            }
        }
        return 0;
    }
}
