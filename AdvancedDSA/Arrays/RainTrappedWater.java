package AdvancedDSA.Arrays;

import java.util.*;

public class RainTrappedWater {
    
    public static void main(String[] args) {
        System.out.println("Hello World");

        ArrayList<Integer> ip = new ArrayList<Integer>();// 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
        ip.add(0);ip.add(1);ip.add(0);ip.add(2);ip.add(1);
        ip.add(0);ip.add(1);ip.add(3);ip.add(2);ip.add(1);
        ip.add(2);ip.add(1);
    
        System.out.println(trap(ip));
    }

    public static int trap(final List<Integer> A) {
        int n = A.size();

        ArrayList<Integer> leftMax  = new ArrayList<Integer>(Arrays.asList(new Integer[n]));
        ArrayList<Integer> rightMax = new ArrayList<Integer>(Arrays.asList(new Integer[n]));

        
        int trappedWater = 0;
        
        System.out.println(A.get(0));

        leftMax.set(0,A.get(0));
        rightMax.set(n-1,A.get(n-1));

        for(int i =1, j = n-2; i < n && j >= 0; i++){
            
            leftMax.set(i, Math.max(A.get(i), leftMax.get(i-1)));
            rightMax.set(j, Math.max(A.get(j), rightMax.get(j+1)));
            j--;
        }

        for(int i =0; i < n; i++){
            trappedWater += Math.min(leftMax.get(i),rightMax.get(i)) - A.get(i);
        }
        return trappedWater;
    }
}
