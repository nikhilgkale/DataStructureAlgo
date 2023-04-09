package Subarray.SumOfAllSubmatrices;

public class SumOfAllSubmatrices {
    public int solve(int[][] A) {
        int sum = 0;
        int n = A.length;
        int m = A[0].length;

        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                sum=sum+((i+1)*(j+1)*(n-i)*(m-j)*A[i][j]);
            }
        }

        return sum;
    }
}
