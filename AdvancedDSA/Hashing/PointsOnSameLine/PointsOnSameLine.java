package AdvancedDSA.Hashing.PointsOnSameLine;

import java.util.HashMap;
import java.util.Map;

public class PointsOnSameLine {

    public static void main(String[] args)
    {
        int[] A   = new int[]{-1, 0, 1, 2, 3, 3};
        int[] B   = new int[]{1, 0, 1, 2, 3, 4};

        int output = solve(A, B);
        System.out.println(output);  
    }
    public static int solve(int[] A, int[] B) {
        int res = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int equal = 1;
            for (int j = i + 1; j < A.length; j++) {
                    if (A[i] == A[j] && B[j] == B[i]) equal++;
                    else {
                        int y = B[i] - B[j];
                        int x = A[i] - A[j];
                        int g__ = gcd(y, x);
                        String str = (x / g__) + "_" + (y / g__);
                        map.put(str, map.getOrDefault(str, 0) + 1);
                }
            }
            res = Math.max(res, equal);
            System.out.println(map.toString());
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                res = Math.max(res, e.getValue() + equal);
            }
            map.clear();
        }
        return res;
    }


    private static int gcd(int x, int y){
        if(x==0){
            return y;
        }
        return gcd(y%x, x);
    }
}
