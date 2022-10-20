package AdvancedDSA.TwoPointers.ClosestPairFromSortedArrays;

public class ClosestPairFromSortedArrays {
    
    public static void main(String[] args)
    {
        int[] A   = new int[]{5, 10, 20 };
        int[] B   = new int[]{1, 2, 30 };
        int[] output = solve(A, B, 13);

        System.out.println();
        for(int i=0; i<output.length;i++){
            System.out.print(output[i] + " ");  
        }
    }

    public static int[] solve(int[] A, int[] B, int C) {
        int m = A.length;
        int n = B.length;
        int result[] = new int[2];
        int mindiff = Integer.MAX_VALUE;
        int left = 0;
        int right = n-1;
        while(left < m && right >=0){
            int diff = Math.abs(A[left] + B[right] - C);
            if(diff == mindiff && A[left] == result[0])
            {
                result[1] = B[right];
            }
            if(diff < mindiff){
                mindiff = diff;
                result[0] = A[left];
                result[1] = B[right];
            }
       

            if((A[left] + B[right] ) > C){
                right--;
            }else{
                left++;
            }
        }
        return result;
    }
}
