package Arrays.RainWaterTapping;

public class RainWaterTrapping {
    public static void main(String[] args) {
        System.out.print("Water Collected : ");
        System.out.println(Solve(new int[]{4,2,5,7,4,2,3,6,8,2,3}));
        //System.out.print(Solve(new int[]{0,1,0,2}));
        System.out.println();
    }

    public static int Solve(int[] A) {
        int waterCollected = 0;
        int n = A.length;
        int[] leftMax  = new int[n];
        int[] rightMax = new int[n];
        

        leftMax[0]  = A[0];
        for(int i = 1; i < n; i++){
            leftMax[i]  = Math.max(leftMax[i-1], A[i]);
        }

        rightMax[n-1] = A[n-1];
        for(int j = n-2; j >= 0 ; j--){
            rightMax[j] = Math.max(rightMax[j+1], A[j]);
        }

        for(int i = 1; i < n; i++){
            waterCollected  += Math.min(leftMax[i], rightMax[i]) - A[i];
         }

        return waterCollected;
    }
}
