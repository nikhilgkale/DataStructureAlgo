package AdvancedDSA.Arrays.MinimumSwaps2;

import java.util.ArrayList;

public class MinimumSwaps2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add
        System.out.println(solve(new int[]{1,2,3,4,0}));
    }
    public static int solve(int[] A) {
        int count=0;
        int N=A.length;
        int s=0;
        while(s<N){
            if(A[s]!=s){
                count++;
                int temp=A[A[s]];
                A[A[s]]=A[s];
                A[s]=temp;
            }
            else s++;
        }
        return count;
    }
}
