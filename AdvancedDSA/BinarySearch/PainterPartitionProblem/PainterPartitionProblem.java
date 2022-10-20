package AdvancedDSA.BinarySearch. PainterPartitionProblem;

public class PainterPartitionProblem {
    public static void main(String[] args)
    {
        System.out.println(paint(3,10,new int[]{185,186,938,558,655,461,441,234,902,681}));
    }
    
    public static int paint(int A, int B, int[] C) {

        long ans = 0;
        int mod = 10000003;

        long l = C[0];
        long r = C[0];
        // Traverse array elements from second and
        // compare every element with current max 
        for (int i = 1; i < C.length; i++){
            if (C[i] > l){
                l = C[i];
            }
            r += C[i];
        }

        while(l<=r){
            long mid = l+(r-l)/2;

            if(check(A, C, mid)){
                ans = mid;
                r = mid -1;
            }else{
                l = mid+1;
            }
        }
        return (int)((ans*B)%mod);
    }

    private static boolean check(int A,int[] C, long mid){

        int painter = 1;
        long completed_boards = 0;

        for(int i =0; i < C.length; i++){
            if(completed_boards + C[i] <= mid){
                completed_boards += C[i]; 
            }else{
                painter++;
                completed_boards = C[i];
            }
        }
        if(painter <= A){
            return true;
        }
        return false;
    }
}
