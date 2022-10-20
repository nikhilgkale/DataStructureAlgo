package Subsequence_Subset;

import java.math.BigInteger;

public class SumTheDifference {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(solve(new int[]{5, 4, 2 }));
    }
    static int  solve(int[] A)
    {
        int sum = 0;
        int n = A.length;
    
        int opsize = (int)Math.pow(2, n);
       
        /* Run from counter 000..1 to 111..1*/
        for (int counter = 3; counter < opsize; counter++)
        {
            int min = 0;
            int max = 0;
            int count = 0;

            for (int j = 0; j < n; j++)
            {
                if (BigInteger.valueOf(counter).testBit(j)){

                    if(count == 0){
                        min = A[j];
                        max = A[j];
                        count++;
                    }

                    System.out.print(A[j]+" ");

                    if(min > A[j]){
                        min = A[j];
                    }

                    if(max < A[j]){
                        max = A[j];
                    }
                }
            }
            System.out.println();
            System.out.println("Min : " + min + "Max : " + max);
            if(min !=max){
                sum = (sum%1000000007 + (max-min)%1000000007)%1000000007;
            }
        }
        return sum;
    } 
}
