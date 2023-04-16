package AdvancedDSA.Arrays.MaxChunksToMakeSorted;

public class MaxChunksToMakeSorted {
    public static void main(String[] args) {
        //System.out.println(solve(new int[]{1,2,3,4,0}));
        System.out.println(solve(new int[]{1,2,0,3}));
    }

    public static int solve(int[] A) {

        int maxNo = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 0; i < A.length; i++){

            maxNo = Math.max(maxNo, A[i]);

            if(maxNo == i){
                count++;
            }
        }
        return count;
    }
}
