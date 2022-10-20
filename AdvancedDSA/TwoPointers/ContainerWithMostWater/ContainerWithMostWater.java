package AdvancedDSA.TwoPointers.ContainerWithMostWater;

public class ContainerWithMostWater {
    public static void main(String[] args)
    {
        System.out.println(maxArea(new int[]{ 1,5,4,3,2}));  
    }

    public static int maxArea(int[] A) {
        int n = A.length;
        int l = 0;
        int r = n-1;
        int maxArea = Integer.MIN_VALUE;

        if(n==1){
            return 0;
        }

        while(l<=r){
            int area = Math.min(A[l], A[r]) * (r-l);

            if(area > maxArea){
                maxArea = area;
            }

            if(A[l] < A[r]){
                l++;
            }else{
                r--;
            }
        }

        return maxArea;
    }
}
