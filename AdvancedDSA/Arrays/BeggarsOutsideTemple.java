package AdvancedDSA.Arrays;

public class BeggarsOutsideTemple {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] output = solve(5, new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}});

        for(int i = 0; i < 5; i++){
            System.out.println();
            System.out.print(output[i]);
        }
    }
    
    
    public static int[] solve(int A, int[][] B) {
        int[] BG   = new int[A];
        int[] PSum = new int[A];

        for(int i=0; i<B.length;i++){

            for(int j=B[i][0]-1; j<B[i][1];j++){
                PSum[j] = PSum[j]+ B[i][2];
            }
        }

        for(int i=0; i<BG.length;i++){
            BG[i] = PSum[i];
        }
        return BG;
    }
}
