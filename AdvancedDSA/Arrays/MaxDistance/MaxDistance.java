package AdvancedDSA.Arrays.MaxDistance;

public class MaxDistance {

    public static void main(String[] args) {
        //System.out.println(solve(new int[]{1,2,3,4,0}));
        System.out.println("Max Distance : " + maximumGap(new int[]{3,5,4,2}));
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int maximumGap(final int[] A) {
        int len = A.length;
        //Create right max array
        int[] rightMax = new int[len];
        rightMax[len - 1] = A[len - 1];
        
        for(int i = 1 ; i < len ; i++){
            rightMax[len - i - 1] = Math.max(rightMax[len - i] , A[len - i - 1]);
            //System.out.println(rightMax[len - i - 1]);
        }
        
        //using two pointer approach finding maximum value of j - i
        int p1 = 0;
        int p2 = 0;
        int ans = Integer.MIN_VALUE;
        
        while( p1 < len && p2 < len){
            if( A[p1] <= rightMax[p2] ){
                ans = Math.max(ans , p2 - p1);
                p2++;
            }else{
                p1++;
            }
        }
        return ans;
    }
}
