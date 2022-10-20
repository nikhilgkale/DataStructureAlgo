package AdvancedDSA.Hashing.LongestConsecutiveSequence;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    //100, 4, 200, 1, 3, 2
    public static void main(String[] args)
    {
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));  
    }
    public static int longestConsecutive(final int[] A) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < A.length; i++){
            if(!hs.contains(A[i])){
                hs.add(A[i]);
            }
        }
        int ans = 0;
        for(Integer x : hs){
            if(!hs.contains(x-1)){
                int chain = 1;
                int y = x+1;

                while(hs.contains(y)){
                    chain++;
                    y++;
                }

                ans = Math.max(ans,chain);
            }
        }

        return ans;
    }
}
