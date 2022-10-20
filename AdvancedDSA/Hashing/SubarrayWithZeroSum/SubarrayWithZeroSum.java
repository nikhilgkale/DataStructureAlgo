package AdvancedDSA.Hashing.SubarrayWithZeroSum;

import java.util.HashSet;

public class SubarrayWithZeroSum {
    public static void main(String[] args)
    {
        System.out.println(solve(new int[]{-1, 1}));  
    }
    public static int solve(int[] A) {
        HashSet<Long> set = new HashSet<>();
        int N = A.length;
        long sum = 0;
        set.add(sum);
        for (int i = 0; i < N; i++) {
            sum += A[i];
            if (set.contains(sum)) {
                return 1;
            }
            else {
                set.add(sum);
            }
        }

        return 0;
    }
}
