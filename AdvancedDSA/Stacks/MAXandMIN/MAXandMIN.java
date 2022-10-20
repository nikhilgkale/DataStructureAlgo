package AdvancedDSA.Stacks.MAXandMIN;

import java.util.*;

public class MAXandMIN {
    
    public static void main(String[] args)
    {
        System.out.println(solve(new int[]{4, 7, 3, 8}));  
    }

    public static int solve(int[] A) {
        
        int mod = 1000 * 1000 * 1000 + 7;

        long ans = 0;

        int[] ls = getLeftNearestSmall(A);
        int[] rs = getRightNearestSmall(A);
        int[] lg = getLeftNearestGreat(A);
        int[] rg = getRightNearestGreat(A);
        
        for(int i = 0; i < A.length; i++){

            long max             = (1L * (i - lg[i]) * (rg[i]-i)) % mod;
            long maxContribution = (A[i] * max) % mod;

            long min             = (1L * (i - ls[i]) * (rs[i]-i)) % mod;
            long minContribution = (A[i] * min) % mod;

            ans = (ans % mod) + ((maxContribution-minContribution) % mod);

            ans = (ans % mod);
        }

        if (ans < 0) {
            ans = (ans + mod) % mod;
        }

        return (int) (ans % mod);
    }

    private static int[] getLeftNearestSmall(int[] input){
        int[] output = new int[input.length];

        Arrays.fill(output, -1);

        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < input.length; i++){
            while(!stack.isEmpty() && input[stack.peek()] >= input[i]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                output[i] = stack.peek();
            }
            stack.push(i);
        }

        return output;
    }

    private static int[] getRightNearestSmall(int[] input){
        int[] output = new int[input.length];

        Arrays.fill(output, input.length);
        Stack<Integer> stack = new Stack<>();
        
        for(int i = input.length-1; i >= 0; i--){
            while(!stack.isEmpty() && input[stack.peek()] >= input[i]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                output[i] = stack.peek();
            }
            stack.push(i);
        }

        return output;
    }

    private static int[] getLeftNearestGreat(int[] input){
        int[] output = new int[input.length];

        Arrays.fill(output, -1);
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < input.length; i++){
            while(!stack.isEmpty() && input[stack.peek()] <= input[i]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                output[i] = stack.peek();
            }
            stack.push(i);
        }

        return output;
    }

    private static int[] getRightNearestGreat(int[] input){
        int[] output = new int[input.length];

        Arrays.fill(output, input.length);
        Stack<Integer> stack = new Stack<>();
        
        for(int i = input.length-1; i >= 0; i--){
            while(!stack.isEmpty() && input[stack.peek()] <= input[i]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                output[i] = stack.peek();
            }
            stack.push(i);
        }

        return output;
    }
}