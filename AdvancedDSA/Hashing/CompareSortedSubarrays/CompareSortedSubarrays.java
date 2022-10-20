package AdvancedDSA.Hashing.CompareSortedSubarrays;

import java.util.*;

public class CompareSortedSubarrays {
    public static void main(String[] args)
    {
        int[] A   = new int[]{1,7,11,9,11,8,7,1};
        int[][] B = new int[][]{{0,1,6,7},{2,3,4,5}};

        int[] output = solve(A, B);
        
        for(int i = 0; i < output.length; i++)
            System.out.println(output[i]);  
    }

    static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    static HashSet<Integer> set = new HashSet<Integer>();
    public static int[] solve(int[] A, int[][] B) {

        rand(A);
        int[] res = new int[B.length];
        long[] prefix = new long[A.length+1];
        prefix[0] = 0;
        int k = 1;
        for(int a : A)
        {
            prefix[k] = prefix[k-1]+map.get(a);
            k++;
        }
        for(int i=0; i<B.length; i++)
        {
            if(B[i][1]-B[i][0] == B[i][3]-B[i][2])
            {
                if(prefix[ B[i][1]+1 ]-prefix[ B[i][0] ] == prefix[ B[i][3]+1 ]-prefix[ B[i][2] ])
                    res[i] = 1;
                else
                    res[i] = 0;
            }
            else
                res[i] = 0;
        }
        return res;
    }

    //To create hash value for distinct number using random function. 
    private static void  rand(int[] A)
    {
        int min = 1;
        int max = 1000000007;
        int range = max-min+1;
        for(int i=0; i<A.length; i++)
        {
            if( !map.containsKey(A[i]) )
            {
                int value = (int)(0D+ 1D*Math.random()*range + min);
                while(set.contains(value))
                {
                    value = (int)(0D+ 1D*Math.random()*range + min);
                }
                map.put(A[i], value);
                set.add(value);
            }
        }
    }
}
