package AdvancedDSA.TwoPointers.MinimizeTheAbsoluteDifference;

public class MinimizeTheAbsoluteDifference {

    public static void main(String[] args)
    {
        int[] A   = new int[]{1, 4, 5, 8, 10 };
        int[] B   = new int[]{6, 9, 15 };
        int[] C   = new int[]{2, 3, 6, 6 };

        System.out.println(solve(A,B,C));  
    }

    public static int solve(int[] A, int[] B, int[] C) {
        int ans = Integer.MAX_VALUE;
        int P1=0,P2=0,P3=0;

        while(P1 < A.length && P2 < B.length && P3 < C.length){
            int max = Math.max(A[P1], Math.max(B[P2], C[P3]));
            int min = Math.min(A[P1], Math.min(B[P2], C[P3]));
            int diff = Math.abs(max-min);
            ans = Math.min(ans,diff);

            if(min==A[P1]){
                P1++;
            }else if(min==B[P2]){
                P2++;
            }else{
                P3++;
            }
        }

        return ans;
    }
}
