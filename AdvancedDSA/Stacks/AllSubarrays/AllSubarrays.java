package AdvancedDSA.Stacks.AllSubarrays;

import java.util.*;

public class AllSubarrays {

    public static void main(String[] args)
    {
        System.out.println(solve(new int[]{4, 1, 3, 2}));  
    }

    public static int solve(int[] A) {
        int ans = 0;

        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < A.length; i++){
            while(!stack.isEmpty() && A[i] >= stack.peek()){
                ans = Math.max(A[i]^stack.pop(), ans);// Max ^ 2nd max
            }

            if(!stack.isEmpty()){
                ans = Math.max(A[i]^stack.peek(), ans);// Min ^ Max
            }

            stack.push(A[i]);
        }
        stack.clear();

        return ans;
    }
}
