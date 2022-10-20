package AdvancedDSA.TwoPointers.PairsWithGivenSumII;

import java.util.Arrays;

public class PairsWithGivenSumII {

    public static void main(String[] args)
    {
        System.out.println(solve(new int[]{1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 }, 2));  
    }
    public static int solve(int[] A, int B) {
        Arrays.sort(A);
        long count = 0;
        int n = A.length;
        int i = 0;
        int j = n-1;

        while(i<j){
            if((long)A[i]+(long)A[j] == (long)B){

                if(A[i] == A[j]){
                    long freq = j-i+1;
                    count+=(freq*(freq-1)/2)%1000000007;
                    break;
                }else{
                    long c1=0;
                    long c2=0;
                    int x=A[i];
                    while(A[i]==x && i<n){
                        i++;
                        c1++;
                    }
                    int y=A[j];
                    while(A[j]==y && j>=0){
                        j--;
                        c2++;
                    }
                    count+= (c1*c2)%1000000007;
                }
            }else if((long)A[i]+(long)A[j] > (long)B){
                j--;
            }else{
                i++;
            }
        }

        return (int)(count%1000000007);
    }
    
}
