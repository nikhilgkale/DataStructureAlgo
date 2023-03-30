package Subarray;

public class MaxSubarraySum2 {
    
    public static void main(String[] args) {
        
        int[] input  = new int[]{-20,10,-12,6,5,-3,8,9,-4};
        int[] output = Solve(input);

        System.out.print("Maximum Subarray Sum : ");
        System.out.print(output[0]);
        System.out.print(" And Subarray is : ");

        for(int i = output[1]; i <= output[2]; i++){
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static int[] Solve(int[] A) {
        
        int[] op = new int[3];

        int subSum=0; int ans = Integer.MIN_VALUE;
        
        int n = A.length;
        int l = 0;
        int r = 0;

        for(int i =0; i < n; i++){

            if(subSum == 0){
                l = i;
            }

            subSum = subSum + A[i];

            ans = Math.max(ans, subSum);

            if(ans == subSum){
                r = i;
            }

            if(subSum < 0){
                subSum = 0;
            }
        }

        op[0] = ans;
        op[1] = l;
        op[2] = r;

        return op;
    }
}
