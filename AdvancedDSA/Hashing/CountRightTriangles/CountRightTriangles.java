package AdvancedDSA.Hashing.CountRightTriangles;

import java.util.HashMap;

public class CountRightTriangles {
    //TC = O(n)
    //A = [1, 1, 2, 3, 3]
    //B = [1, 2, 1, 2, 1]
    public static void main(String[] args)
    {
        System.out.println(solve(new int[]{1, 1, 2, 3, 3 }, new int[]{1, 2, 1, 2, 1}));  
    }

    public static int solve(int[] A, int[] B) {
        int count = 0;
        int mod = 1000000007;

        HashMap<Integer, Integer> xMap = new HashMap<>();
        HashMap<Integer, Integer> yMap = new HashMap<>();

        for(int i = 0; i < A.length; i++){
            if(xMap.containsKey(A[i])){
                xMap.put(A[i],xMap.get(A[i])+1);
            }else{
                xMap.put(A[i],1);
            }

             if(yMap.containsKey(B[i])){
                yMap.put(B[i],yMap.get(B[i])+1);
            }else{
                yMap.put(B[i],1);
            }
        }

        for(int j = 0; j < A.length; j++){
        
            int count1 = xMap.get(A[j]);
            int count2 = yMap.get(B[j]);

            count += ((count1-1)%mod)*((count2-1)%mod);
        }
        
        return count%mod;
    }
}
