package AdvancedDSA.Hashing.ShaggyAndDistances;

import java.util.HashMap;

public class ShaggyAndDistances {
    public static int solve(int[] A) {
        int ans = Integer.MAX_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < A.length; i++){
            if(map.containsKey(A[i])){
                ans = Math.min(ans, i-map.get(A[i]));
                map.put(A[i],i);
            }else{
                map.put(A[i],i);
            }
        }
        if(ans != Integer.MAX_VALUE){
            return ans;
        }
        return -1;
    }
}
